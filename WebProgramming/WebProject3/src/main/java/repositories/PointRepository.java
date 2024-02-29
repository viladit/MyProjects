package repositories;

import models.Point;
import validators.PointValidator;

import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.context.FacesContext;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import com.google.gson.Gson;
import jakarta.transaction.Transactional;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Named("pointRepository")
@SessionScoped
public class PointRepository implements Serializable{
    private static final int LATEST_POINTS_COUNT = 10;

    private float roundY(double y) {
        if (y < 0) {
            return (float) (Math.ceil(y * 1000) / 1000);
        } else {
            return (float) Math.floor(y * 10000) / 10000;
        }
    }
    private float processY(String yString) {
        if (yString.length() <= 6) {
            return Float.parseFloat(yString);
        } else {
            return roundY(Float.parseFloat(yString));
        }
    }

    @PersistenceContext
    private EntityManager entityManager;

    public List<Point> getPointsList(int start, int count) {
        return entityManager.createQuery("select point from Point point", Point.class)
                .setFirstResult(start).setMaxResults(count).getResultList();
    }

    public List<Point> getLatestAttemptsList() {
        int attemptsCount = getPointsCount();
        int firstResultIndex = Math.max(attemptsCount - LATEST_POINTS_COUNT, 0);
        return  entityManager.createQuery("select point From Point point", Point.class)
                .setFirstResult(firstResultIndex).setMaxResults(LATEST_POINTS_COUNT).getResultList();
    }

    @Transactional
    public Point addPoint(Point point) {
        PointValidator.isHit(point);
        entityManager.merge(point);
        entityManager.flush();
        return point;
    }

    public int getPointsCount() {
        return entityManager.createQuery("select count(*) from Point", Number.class).getSingleResult().intValue();
    }

    @Transactional
    public void clearPoints() {
        entityManager.createQuery("delete from Point").executeUpdate();
    }

    @Transactional
    public void addPointFromJsParams(int currentR) {
        final Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();

        try {
            var x = Float.parseFloat(params.get("x"));
            var y = processY(params.get("y"));
            var graphR = Float.parseFloat(params.get("r"));

            final Point attemptBean = new Point(
                    x / graphR * currentR,
                    y / graphR * currentR,
                    currentR
            );
            addPoint(abstractPoint);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public String collectToJson(Function<? super Point, Float> getter) {
        return new Gson().toJson(getLatestAttemptsList().stream().map(getter).collect(Collectors.toList()));
    }

    public String getX() {
        return collectToJson(Point::getX);
    }

    public String getY() {
        return collectToJson(Point::getY);
    }

    public String getR() {
        return collectToJson(Point::getR);
    }

    public String getHit() {
        return new Gson().toJson(getLatestPointsList().stream().map(Point::isResult).collect(Collectors.toList()));
    }

    public String getPointsCoordinates() {
        return new Gson().toJson(
                getLatestAttemptsList().stream().map(Point::getCoordinates).collect(Collectors.toList())
        );
    }
}

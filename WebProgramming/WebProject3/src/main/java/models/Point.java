package models;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

@Entity
@Named("abstractPoint")
@SessionScoped
@Table(name="points")
public class Point implements Serializable {
    @Deprecated
    public Point() {
    }

    public Point(float x, float y, float r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public static class Coordinates {
        private final float x;
        private final float y;
        private final float r;
        private final boolean status;

        @Override
        public String toString() {
            return "Coordinates{" +
                    "x=" + x +
                    ", y=" + y +
                    ", r=" + r +
                    ", status=" + status +
                    '}';
        }

        public Coordinates(float x, float y, float r, boolean status) {
            this.x = x;
            this.y = y;
            this.r = r;
            this.status = status;
        }

        public float getX() {
            return x;
        }

        public float getY() {
            return y;
        }

        public float getR() {
            return r;
        }

        public boolean getStatus() {
            return status;
        }


    }
    @Id
    @GeneratedValue
    @Column(name="id", nullable=false, unique=true)
    private Long id;

    @NotNull
    @Column(name="x", nullable=false)
    private float x = 0;

    @NotNull
    @Column(name="y", nullable=false)
    private float y = 0;

    @NotNull
    @Column(name="r", nullable=false)
    private float r = 1;

    @NotNull
    @Column(name="status", nullable=false)
    private Boolean status;

    @NotNull
    @Column(name="created_at", nullable=false)
    private String time;

    @NotNull
    @Column(name="script_time", nullable=false)
    private long scriptTime;

    public Point(Long id, float x, float y, float r, Boolean status, String time, long scriptTime) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.r = r;
        this.status = status;
        this.time = time;
        this.scriptTime = scriptTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public Boolean getStatus() {
        return status;
    }

    public String getStatusWord(){
        return (status)
                ? "true"
                : "false";
    }

    public String getStatusString(){
        return (status)
                ? "true"
                : "false";
    }

    public String getStatusHTMLClass(){
        return (status)
                ? "green-status"
                : "red-status";
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public long getScriptTime() {
        return scriptTime;
    }

    public void setScriptTime(long scriptTime) {
        this.scriptTime = scriptTime;
    }

    @Override
    public String toString() {
        return x + " " + y + " " + r;
    }

    private Coordinates getCoordinates() {
        return new Coordinates(x, y, r, status);
    }

}

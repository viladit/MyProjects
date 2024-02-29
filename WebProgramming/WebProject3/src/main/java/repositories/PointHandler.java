package repositories;

import org.primefaces.model.FilterMeta;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortMeta;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.List;
import java.util.Map;

@Named("pointHandler")
@SessionScoped
public class PointHandler extends LazyDataModel<Point> {
    @Inject
    private PointRepository service;

    @Override
    public int count(Map<String, FilterMeta> map) {
        return service.getPointsCount;
    }

    @Override
    public List load(int first, int pageSize, Map<String, SortMeta> map, Map<String, FilterMeta> map1) {
        return service.getPointsList(first, pageSize);
    }
}

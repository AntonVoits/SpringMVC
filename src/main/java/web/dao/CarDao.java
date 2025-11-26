package web.dao;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public interface CarDao {
    static List<Car> cars = new ArrayList<>();

    public List<Car> getCars(int count);
}

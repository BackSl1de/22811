package web.DAO;

import web.model.Car;

import java.util.List;

public interface DaoInt {
    List<Car> getCars(int count);
}

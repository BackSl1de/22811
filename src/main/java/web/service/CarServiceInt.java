package web.service;

import web.model.Car;

import java.util.List;

public interface CarServiceInt {
    List<Car> getCars(int count);
}

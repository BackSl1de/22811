package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class DaoClass implements DaoInt {
    private final List<Car> cars = new ArrayList<>();

    public DaoClass() {
        cars.add(new Car("lada", 2000, "orange"));
        cars.add(new Car("mazda", 2200, "red"));
        cars.add(new Car("kia", 2300, "white"));
        cars.add(new Car("bmw", 3000, "black"));
        cars.add(new Car("hueta", 2000, "green"));
    }

    @Override
    public List<Car> getCars(int count) {
        List<Car> filteredCars = cars;
        if (count <= 5) {
            filteredCars = cars.stream().limit(count).collect(Collectors.toList());
        }
        return filteredCars;

    }
}

package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.DAO.DaoInt;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceClass implements CarServiceInt {
    private DaoInt daoInt;

    @Autowired

    public CarServiceClass(DaoInt daoInt) {
        this.daoInt = daoInt;
    }

    @Override
    public List<Car> getCars(int count) {
        return daoInt.getCars(count);
    }
}

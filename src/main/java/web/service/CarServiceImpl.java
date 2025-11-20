package web.service;

import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.models.Car;

import java.util.List;

public class CarServiceImpl implements CarService {

    private CarDao carDao = new CarDaoImpl();

    public List<Car> printCars(int number) {
        return carDao.printCars(number);
    }
}

package web.services;

import org.springframework.stereotype.Component;

import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.models.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private CarDao carDao = new CarDaoImpl();

    public List<Car> printCars(Integer number) {
        if (number == null || number <= 0 || number >= 5) {
            return carDao.printCars(5);
        } else {
            return carDao.printCars(number);
        }
    }
}

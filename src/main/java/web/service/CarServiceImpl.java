package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDao carDao;

    public CarServiceImpl(CarDaoImpl carDao) {
        this.carDao = carDao;
    }

    public List<Car> printCars(Integer number) {
        if (number == null) {
            return carDao.printCars();
        }
        return carDao.printCars().stream().limit(number).toList();
    }
}

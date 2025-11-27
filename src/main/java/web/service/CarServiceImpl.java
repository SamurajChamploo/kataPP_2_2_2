package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    private final CarDao carDao;

    public CarServiceImpl(CarDaoImpl carDao) {
        this.carDao = carDao;
    }

    public List<Car> printCars(Integer number) {
        return carDao.printCars(Optional.ofNullable(number)
                .filter(n -> n > 0 && n < 5)
                .orElse(5));
    }
}

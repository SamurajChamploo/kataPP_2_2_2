package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao{

    private Integer CARS_COUNT = 0;
    private List<Car> cars;

    public List<Car> printCars() {
        cars = new ArrayList<>();

        cars.add(new Car(++CARS_COUNT, "Honda", "black"));
        cars.add(new Car(++CARS_COUNT, "BMW", "white"));
        cars.add(new Car(++CARS_COUNT, "Mercedes", "red"));
        cars.add(new Car(++CARS_COUNT, "Zeekr", "orange"));
        cars.add(new Car(++CARS_COUNT, "Lexus", "silver"));

        return cars;
    }
}

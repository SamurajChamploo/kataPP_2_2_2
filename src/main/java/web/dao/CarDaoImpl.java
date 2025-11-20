package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao{
    private static int CARS_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++CARS_COUNT, "Honda", "black"));
        cars.add(new Car(++CARS_COUNT, "BMW", "white"));
        cars.add(new Car(++CARS_COUNT, "Mercedes", "red"));
        cars.add(new Car(++CARS_COUNT, "Zeekr", "orange"));
        cars.add(new Car(++CARS_COUNT, "Lexus", "silver"));
    }

    public List<Car> printCars(int number) {
        List<Car> result = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            result.add(cars.get(i));
        }
        return result;
    }
}

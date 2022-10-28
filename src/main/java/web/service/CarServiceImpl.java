package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Mercedes", 1234, "Black"));
        cars.add(new Car("Audi", 4321, "Blue"));
        cars.add(new Car("Porshe", 666, "Red"));
        cars.add(new Car("Volkswagen", 545, "Gray"));
        cars.add(new Car("Nissan", 293, "White"));
    }

    public List<Car> carsList(int count) {
        return cars.stream().limit(count).toList();
    }
}

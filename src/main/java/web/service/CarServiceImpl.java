package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    public List<Car> carsCount (int count) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Model1", 2024, "Color1"));
        cars.add(new Car("Model2", 2018, "Color2"));
        cars.add(new Car("Model3", 2024, "Color3"));
        cars.add(new Car("Model4", 2022, "Color4"));
        cars.add(new Car("Model5", 2026, "Color5"));

        return cars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }

}
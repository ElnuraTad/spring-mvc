package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarService {
    private static List<Car> cars;
    static {
        cars = new ArrayList<>();
        cars.add(new Car(1,"BMW", "Black"));
        cars.add(new Car(2,"Toyota", "White"));
        cars.add(new Car(3,"Tesla", "Red"));
        cars.add(new Car(4,"Ferrari", "Grey"));
        cars.add(new Car(5,"Hyundai", "Blue"));
    }

    public List<Car> getCars(Integer count) {
        if (count == null) {
            for(int i = 0;i <= 5; i++ )
                count = 5;
            }
        return new ArrayList<>(cars).stream().limit(Math.min(count, 5)).collect(Collectors.toList());
    }
}



package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {
    private static int CarId;
    private static List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(++CarId, "Mercedes", "C230"));
        cars.add(new Car(++CarId, "Lexus", "IS300"));
        cars.add(new Car(++CarId, "Mazda", "CX30"));
        cars.add(new Car(++CarId, "Mercedes", "GLC300"));
        cars.add(new Car(++CarId, "VW", "Golf"));
    }

    public List<Car> getCars(int count) {
        List<Car> newCarsList = new ArrayList<>();

        if (count == 1) {
            newCarsList.add(cars.get(0));
        }
        if (count == 2) {
            newCarsList.add(cars.get(0));
            newCarsList.add(cars.get(1));
        }
        if (count == 3) {
            newCarsList.add(cars.get(0));
            newCarsList.add(cars.get(1));
            newCarsList.add(cars.get(2));
        }
        if (count == 4) {
            newCarsList.add(cars.get(0));
            newCarsList.add(cars.get(1));
            newCarsList.add(cars.get(2));
            newCarsList.add(cars.get(3));
        } else if (count >= 5) {
            newCarsList.addAll(cars);
        }
        return newCarsList;
    }
}

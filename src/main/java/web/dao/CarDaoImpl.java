package web.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import web.models.Car;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> cars = List.of(
            new Car(1, "Lada", 12345),
            new Car(1, "Geely", 23456),
            new Car(1, "Mersedes", 34567),
            new Car(1, "BMW", 45678),
            new Car(1, "UAZ", 56789));

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
}

package dao;

import model.Car;

public interface CarDao {
    void save(Car car);
    Car carQuery(String number);
}

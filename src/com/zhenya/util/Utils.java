package com.zhenya.util;

import com.zhenya.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static void setUpCar(Car car, String brand, String model, int doors, double engineVolume, double fuelUsage,
                                int seats, int speed) {
        car.setDoors(doors);
        car.setEngineVolume(engineVolume);
        car.setFuelUsage(fuelUsage);
        car.setSeats(seats);
        car.setSpeed(speed);
        car.setBrand(brand);
        car.setModel(model);
    }

    public static List<Car> generations(int numberObject) {
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < numberObject; i++) {
            carList.add(new Car());
        }
        return carList;
    }
}

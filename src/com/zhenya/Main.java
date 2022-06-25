package com.zhenya;

import com.zhenya.domain.Car;
import com.zhenya.interfaces.CarsActions;
import com.zhenya.interfaces.CarsBrands;
import com.zhenya.util.Utils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car[] cars = Utils.generations(10).toArray(new Car[0]);
        Utils.setUpCar(cars[0], CarsBrands.MERCEDES, "W221", 4, 5.0, 15,
                4, 320);
        Utils.setUpCar(cars[1], CarsBrands.AUDI, "A6", 4, 2.6, 10,
                5, 280);
        Utils.setUpCar(cars[2], CarsBrands.BMW, "2S", 2, 3.0, 9,
                2, 300);
        Utils.setUpCar(cars[3], CarsBrands.OPEL, "Omega", 4, 2.2, 8,
                5, 180);
        Utils.setUpCar(cars[4], CarsBrands.MAZDA, "6", 4, 2.0, 10,
                5, 220);
        Utils.setUpCar(cars[5], CarsBrands.LEXUS, "RX300", 4, 2.0, 9.6,
                4, 200);
        Utils.setUpCar(cars[6], CarsBrands.LADA, "XRay", 4, 1.6, 8.2,
                5, 200);
        Utils.setUpCar(cars[7], CarsBrands.TOYOTA, "RAV4", 4, 4.0, 14,
                5, 240);
        Utils.setUpCar(cars[8], CarsBrands.KIA, "RIO", 4, 1.6, 10,
                5, 210);
        Utils.setUpCar(cars[9], CarsBrands.FORD, "Focus", 4, 1.6, 8.2,
                5, 200);


        Arrays.sort(cars);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        CarsActions carsActions = new Car();
        carsActions.move();
        carsActions.stop();
        carsActions.turn();

    }
}

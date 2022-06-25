package com.zhenya.domain;

import com.zhenya.interfaces.CarsActions;
import com.zhenya.interfaces.CarsBrands;

import java.util.Objects;

public class Car implements CarsActions, CarsBrands, Comparable<Car> {
    private String brand;
    private String model;
    private int doors;
    private double engineVolume;
    private double fuelUsage;
    private int seats;
    private int speed;


    public Car() {

    }

    public Car(String brand, String model, int doors, double engineVolume, double fuelUsage, int seats, int speed) {
        this.brand = brand;
        this.model = model;
        this.doors = doors;
        this.engineVolume = engineVolume;
        this.fuelUsage = fuelUsage;
        this.seats = seats;
        this.speed = speed;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public double getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(double fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return doors == car.doors && Double.compare(car.engineVolume, engineVolume) == 0 &&
                Double.compare(car.fuelUsage, fuelUsage) == 0 && seats == car.seats && speed == car.speed &&
                Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, doors, engineVolume, fuelUsage, seats, speed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", doors=" + doors +
                ", engineVolume=" + engineVolume +
                ", fuelUsage=" + fuelUsage +
                ", seats=" + seats +
                ", speed=" + speed +
                '}';
    }

    @Override
    public void move() {
        System.out.println("All cars must move");
    }

    @Override
    public void stop() {
        System.out.println("All cars must stop");
    }

    @Override
    public void turn() {
        System.out.println("All cars must turn right and left");
    }

    @Override
    public int compareTo(Car car) {
        return (int)fuelUsage - (int)car.getFuelUsage();
    }
}
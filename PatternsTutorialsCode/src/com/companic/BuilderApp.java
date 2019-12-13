package com.companic;

public class BuilderApp {

    public static void main(String[] args) {
//        Car car = new CarBuilder()
//                .make("Nissan")
//                .transmission(Transmission.AUTO)
//                .maxSpeed(350)
//                .build();
//        System.out.println(car);

        Director director = new Director();
        director.setBuilder(new FordMondeoBuilder());

        Car car = director.buildCar();
        System.out.println(car);
    }
}

class Car {
    private String make;
    private Transmission transmission;
    private int maxSpeed;

    public void setMake(String make) {
        this.make = make;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override public String toString() {
        return "Car{" + "make='" + make + '\'' + ", transmission=" + transmission + ", maxSpeed=" + maxSpeed + '}';
    }
}

enum Transmission {
    MANUAL, AUTO
}

abstract class CarBuilder {
    Car car;

    public void createCar() {
        car = new Car();
    }

    abstract void make();
    abstract void transmission();
    abstract void maxSpeed();

    Car getCar() {
        return car;
    }
}

class FordMondeoBuilder extends CarBuilder {

    @Override void make() {
        car.setMake("Ford Mondeo");
    }

    @Override void transmission() {
        car.setTransmission(Transmission.AUTO);
    }

    @Override void maxSpeed() {
        car.setMaxSpeed(250);
    }
}

class SubaruBuilder extends CarBuilder {

    @Override void make() {
        car.setMake("Subaru");
    }

    @Override void transmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    @Override void maxSpeed() {
        car.setMaxSpeed(320);
    }
}

class Director {
    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    public Car buildCar() {
        builder.createCar();
        builder.make();
        builder.transmission();
        builder.maxSpeed();
        return builder.getCar();
    }
}

//class CarBuilder {
//    private String make = "Default";
//    private Transmission transmission = Transmission.MANUAL;
//    private int maxSpeed = 120;
//
//    public CarBuilder make(String make) {
//        this.make = make;
//        return this;
//    }
//
//    public CarBuilder transmission(Transmission transmission) {
//        this.transmission = transmission;
//        return this;
//    }
//
//    public CarBuilder maxSpeed(int maxSpeed) {
//        this.maxSpeed = maxSpeed;
//        return this;
//    }
//
//    public Car build() {
//        Car car = new Car();
//
//        car.setMake(make);
//        car.setTransmission(transmission);
//        car.setMaxSpeed(maxSpeed);
//        return car;
//    }
//}
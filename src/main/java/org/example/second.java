package org.example;

public class second {

    public static void main(String[] args) {

        Vehicle car = new Car("Toyota", 120);
        Vehicle bike = new Bike("Yamaha", 80);

        car.start();
        bike.start();

        car.stop();
        bike.stop();

        Drivable d = new Car("Honda", 100);
        d.drive();
    }
}

abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public abstract void start();

    public void stop() {
        System.out.println(brand + " vehicle stopped");
    }
}

interface Drivable {
    void drive();
}

class Engine {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        }
    }
}

class Car extends Vehicle implements Drivable {

    private Engine engine;

    public Car(String brand, int speed) {
        super(brand);
        engine = new Engine();
        engine.setSpeed(speed);
    }

    public void start() {
        System.out.println(brand + " car started at speed " + engine.getSpeed());
    }

    public void drive() {
        System.out.println(brand + " car is driving");
    }
}

class Bike extends Vehicle {

    private int speed;

    public Bike(String brand, int speed) {
        super(brand);
        this.speed = speed;
    }

    public void start() {
        System.out.println(brand + " bike started at speed " + speed);
    }
}

package Car;

import Car.Engine.Fuel;
import Car.Engine.Motor;

public class Car extends Vehicle {
    private Motor motor;
    private Wheels wheels;
    private int lock;

    public Car(int seats, String category,
               int lock, int weight, String brand, int year, Motor motor, Wheels wheels) {
        super(seats, category, weight, brand, year);
        this.motor = motor;
        this.wheels = wheels;
        this.lock = lock;


    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public int getLock() {
        return lock;
    }

    public void setLock(int lock) {
        this.lock = lock;

    }

    public String carInfo() {
        return "Места:" + getSeats() + ",Категория:" + getCategory() + ",Пароль:" + getLock() + ",Macca:" + getWeight() + ",Марка:" + getBrand() + ",Год выпуска:" + getYear() + ",Двигатель(" + motor.motorInfo() + "), Шины(" + wheels.wheelsInfo() +  ")";




    }

    @Override
    public void start() {
        System.out.println("Машина заведена");

    }

    @Override
    void stop() {
        System.out.println("Машина  заглушена");

    }
    public boolean unlock(int key){
        return this.lock == key;
    }
    public void acceptPassengers(int numberOfPassengers){
        if (numberOfPassengers <= getSeats()){
            System.out.println("Пассажиров село: " + numberOfPassengers);
        }else {
            System.out.println("Недостаточно мест!");
        }
    }
    public void refuel(Fuel fuel){
        if (Fuel.getFuelType().equals(Fuel.getFuelType())){
            System.out.println("Машина заправлена");
        }else {
            System.out.println("Неправильный тип топлива!");
        }
    }
}


















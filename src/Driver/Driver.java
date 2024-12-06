package Driver;

import Car.Car;
import Car.Engine.Fuel;


public class Driver {
    private int key;

    public Driver(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
    public void unlockCar(Car car){
        if (car.unlock(key)){
            System.out.println("Машина открыта");
            System.out.println(car.carInfo());
        }
        else {
            System.out.println("Неверный ключ");
        }
    }
    public void driveCar(Car car){
        if (car.unlock(key)){
            car.start();
            System.out.println("Водитель управляет автомобилем");
        }else {
            System.out.println("Не удалось завести машину!");
        }
    }
    public void acceptPassenger (Car car, int numberOfPassengers ){
        car.acceptPassengers(numberOfPassengers);
    }
    public void refuelCar(Car car, Fuel fuel){
        System.out.println();;
    }

}


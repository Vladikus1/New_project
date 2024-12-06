package Main;

import Car.Car;
import Car.Engine.Fuel;
import Car.Engine.Motor;
import Car.Tyre;
import Car.Wheels;
import Driver.Driver;
import enums.FuelType;
import enums.TyreSeason;

public class CarMain {
    public static void main(String[] args) {
        Motor motor = new Motor(2.0, new Fuel(FuelType.Diesel), "Turbo");
        Wheels wheels = new Wheels((byte) 19, new Tyre(TyreSeason.WINTER), "Белшина");
        Car car = new Car(5, "B", 1234, 2100, "Volvo", 2024, motor, wheels);
        Driver driver = new Driver(1234);
        driver.unlockCar(car);
        driver.driveCar(car);
        driver.acceptPassenger(car, 4);
        Fuel fuel = new Fuel(FuelType.Diesel);
        Fuel correctFuel = new Fuel(FuelType.Diesel);
        driver.refuelCar(car, correctFuel);
        Fuel incorrectFuel = new Fuel(FuelType.Gas);
        driver.refuelCar(car, incorrectFuel);
        Driver wrongDriver = new Driver(4321);
        wrongDriver.unlockCar(car);
        wrongDriver.driveCar(car);


        // Нет сравнения типа топлива двигателя и заправляемого



    }
}
// Если будет время, переделаю более правильно

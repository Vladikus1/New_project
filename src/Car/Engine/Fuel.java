package Car.Engine;

import enums.FuelType;

public class Fuel {
    private static FuelType fuelType;

    public Fuel(FuelType fuelType) {

        Fuel.fuelType = fuelType;
    }

    public static FuelType getFuelType() {

        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        Fuel.fuelType = fuelType;
    }
    public static String Ft() {
        if (getFuelType().equals(FuelType.Diesel))
            return " Дизельное";
        else if (getFuelType().equals(FuelType.Electricity)) {
            return  " Электричество";

        } else if (getFuelType().equals(FuelType.Gasoline)) {
            return " Бензин";

        } else if (getFuelType().equals(FuelType.Gas)) {
            return " Газ";

        } else {
            return "Неизвестный тип топлива";
        }


    }
}

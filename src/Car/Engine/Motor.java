package Car.Engine;


import enums.FuelType;

public class Motor {
    private double volume;
    private Fuel fuel;
    private String name;


    public Motor(double volume, Fuel fuel, String name) {
        this.volume = volume;
        this.fuel = fuel;
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

public String motorInfo(){
        return "Название:" + getName() + ";Тип топлива:" + Fuel.Ft() + ";Объём:" + getVolume();
}

    }














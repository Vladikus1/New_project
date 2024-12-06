package Car;

public  class Vehicle {
    private int seats;
    private String category;
    private int weight;
    private String brand;
    private int year;

    public Vehicle(int seats, String category, int weight, String brand, int year) {
        this.seats = seats;
        this.category = category;
        this.weight = weight;
        this.brand = brand;
        this.year = year;
    }

    public Vehicle() {

    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    void start() {

    }

    void stop() {

    }


}












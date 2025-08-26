package test.vehicle;

public class Car extends Vehicle {
    private String fuelType;

    public Car(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }
    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    @Override
    public void move() {
        System.out.println("Toyota car is driving with gasoline.");
    }
}

package test.vehicle;

public abstract class Vehicle {
    private String brand;
    private int speed;
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
        if(brand == null){
            throw new NullPointerException("Brand cannot be null");
        }
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
        if (speed < 0){
            throw new IllegalArgumentException("Speed must be a positive number");
        }
    }
    public abstract void move();

    public void stop(){
        System.out.println("[brand] has stopped.");
    }
}
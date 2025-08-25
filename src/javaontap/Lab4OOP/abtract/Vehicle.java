package javaontap.Lab4OOP.abtract;

public abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public abstract void move();

    public void stop() {
        System.out.println(brand + " đã dừng lại");
    }
}

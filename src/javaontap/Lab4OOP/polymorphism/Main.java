package javaontap.Lab4OOP.polymorphism;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        Vehicle vehicle1 = new Bus();
        Vehicle vehicle2 = new Vehicle();
        vehicle.run();
        vehicle1.run();
        vehicle2.run();
    }
}

package test.vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car("Toyota" , 100, "Diesel"), new Bicycle("Giant", 30, true)};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            vehicle.stop();
        }
    }
}

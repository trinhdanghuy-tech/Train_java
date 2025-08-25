package javaontap.Lab4OOP.abtract;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        Vehicle moto = new xeMay("Honda");
        car.move();
        car.stop();
        moto.move();
        moto.stop();
    }
}

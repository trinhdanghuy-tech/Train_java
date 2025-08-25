package javaontap.Lab4OOP.inheritance;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Luke", "Duc", 1);
        Dog dog2 = new Dog("mike", "Cai", 2);
        dog1.inThongTin(dog1);
        dog2.inThongTin(dog2);
        Bird bird1 = new Bird("Luke", "Duc", 200.3);
        Bird bird2 = new Bird("mike", "Cai", 100.5);
        bird1.inThongTin(bird1);
        bird2.inThongTin(bird2);
    }
}

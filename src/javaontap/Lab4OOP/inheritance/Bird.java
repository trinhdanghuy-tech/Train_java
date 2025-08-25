package javaontap.Lab4OOP.inheritance;

public class Bird extends Animals{
    private double speed;
    public Bird() {

    }
    public Bird(String name, String gender, double speed) {
        super(name, gender);
        this.speed = speed;
    }
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public Bird nhapThongtin(String name, String gender, double speed) {
        Bird b = new Bird(name, gender, speed);
        return b;
    }
    public void inThongTin(Bird b) {
        System.out.println("Name: " + b.getName());
        System.out.println("Gender: " + b.getGender());
        System.out.println("Speed: " + b.getSpeed() + " km/h");
    }
}

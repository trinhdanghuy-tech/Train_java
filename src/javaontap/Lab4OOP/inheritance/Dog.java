package javaontap.Lab4OOP.inheritance;

public class Dog extends Animals{
    private int age;
    public Dog() {

    }
    public Dog(String name, String gender, int age) {
        super(name, gender);
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Dog nhapThongtin(String name, String gender, int age) {
        Dog d = new Dog(name, gender, age);
        return d;
    }
    public void inThongTin(Dog d) {
        System.out.println("Name: " + d.getName());
        System.out.println("Gender: " + d.getGender());
        System.out.println("Age: " + d.getAge());
    }
}

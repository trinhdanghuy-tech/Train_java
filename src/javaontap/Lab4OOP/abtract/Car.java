package javaontap.Lab4OOP.abtract;

public class Car extends Vehicle{
    public Car(String brand){
        super(brand);
    }
    @Override
    public void move() {
        System.out.println(brand + " xe hơi đang chạy trên đường");
    }
}

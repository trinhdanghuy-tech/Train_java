package javaontap.Lab4OOP.abtract;

public class xeMay extends Vehicle{
    public xeMay(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println(brand + " xe máy đang chạy");
    }
}

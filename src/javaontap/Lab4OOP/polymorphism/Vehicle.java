package javaontap.Lab4OOP.polymorphism;

public class Vehicle {
    private String tenHang;
    private double gia_thanh;
    private int speed;
    public Vehicle() {

    }
    public Vehicle(String tenHang, double gia_thanh, int speed) {
        this.tenHang = tenHang;
        this.gia_thanh = gia_thanh;
        this.speed = speed;
    }
    public String getTenHang() {
        return tenHang;
    }
    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }
    public double getGia_thanh() {
        return gia_thanh;
    }
    public void setGia_thanh(double gia_thanh) {
        this.gia_thanh = gia_thanh;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void run() {
        System.out.println("Vehicle run");
    }
}

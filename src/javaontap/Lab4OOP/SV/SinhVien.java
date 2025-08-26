package javaontap.Lab4OOP.SV;

public class SinhVien {
    int id;
    String name;
    double price;
    double tax;
    public SinhVien() {

    }
    public double getPriceTax() {
        return price * tax;
    }
}

package javaontap.Lab4OOP.product;

public class Main {
    public static void main(String[] args) {
        Product test = new Product();

        Product pr1 = test.nhapThongTin("computer", 200, 0.1);
        test.xuatThongTin(pr1);
        System.out.println("tax = " + test.getTaxPrice(pr1.getPrice() , pr1.getTax()));

    }
}

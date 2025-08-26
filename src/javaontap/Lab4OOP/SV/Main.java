package javaontap.Lab4OOP.SV;

public class Main {
    public static void main(String[] args) {
        SinhVienIT svIT = new SinhVienIT();
        svIT.id = 1;
        svIT.name = "Nguyen Van A";
        svIT.language = "Java";
        svIT.price = 1000;
        svIT.tax = 0.1;

        SinhVienCoKhi svCK = new SinhVienCoKhi();
        svCK.id = 2;
        svCK.name = "Tran Van B";
        svCK.skill = "Hàn";
        svCK.price = 800;
        svCK.tax = 0.08;

        System.out.println(svIT.name + " học phí sau thuế: " + svIT.getPriceTax());
        System.out.println(svCK.name + " học phí sau thuế: " + svCK.getPriceTax());
    }
}


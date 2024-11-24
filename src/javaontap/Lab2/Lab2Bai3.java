
import java.util.Scanner;

public class Lab2Bai3 {
    public static void main(String[] args) {
        int a ;
        int b ;
        double x;
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap gia tri a: ");
        a = sc.nextInt();
        System.out.println("moi nhap gia tri b: ");
        b = sc.nextInt();
        if (a == 0 && b == 0 ) {
            System.out.println("Phuong trinh vo so nghiem");
        }else if (a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiem");
        }else{
            x = (-b)/a;
            System.out.println("Gia tri cua x la: " + x);
        }
    }
}

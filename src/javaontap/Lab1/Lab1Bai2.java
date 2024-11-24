package javaontap.Lab1;
import java.util.Scanner;

public class Lab1Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        int chieudai = sc.nextInt();
        System.out.print("Nhap chieu rong: ");
        int chieurong = sc.nextInt();
        System.out.println("Chu vi hinh chu nhat se la: " + (chieudai + chieurong) * 2);
        System.out.println("Dien tich hinh chu nhat la: " + chieudai * chieurong);
        int canhnhonhat = Math.min(chieudai, chieurong);
        System.out.println("Canh nho nhart: " + canhnhonhat);
        sc.close();
    }
}

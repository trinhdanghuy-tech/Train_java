import java.util.Scanner;

public class Lab2Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thu nhap cua ban: ");
        double thunhap = sc.nextDouble();
        if (thunhap < 10) {
            System.out.println("Ban khong phai dong thue.");

        }
        else if (10 <= thunhap && thunhap <= 15) {
            System.out.println("Thue cua ban la 10%");
        }
        else if (15 < thunhap && thunhap <= 30) {
            System.out.println("Thue cua ban la 20%.");
        }else{
            System.out.println("Thue cua ban la 50%");
        }
    }
}

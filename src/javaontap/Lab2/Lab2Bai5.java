import java.util.Scanner;
public class Lab2Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sodien;
        System.out.println("Moi nhap so dien: ");
        sodien = sc.nextInt();
        if (0 <= sodien && sodien <= 100) {
            int tiendien = sodien * 1000;
            System.out.println("tien dien cua ban se la: " +tiendien);
        }else{
            int tiendien = sodien * 1500;
            System.out.println("tien dien cua bna se la: " + tiendien);
        }
    }
}

import java.util.Scanner;
public class Lab2Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ----------------------------------------- ++");
        System.out.println("| 1. Giải phương trình bậc nhất |");
        System.out.println("| 2. Giải phương trình bậc hai |");
        System.out.println("| 3. Tính số tiền điện |");
        System.out.println("| 4. Kết thúc |");
        System.out.println("++ ------------------ ++");
        System.out.println("Moi nhap lua chon: ");
        int luachon = sc.nextInt();
        switch (luachon) {
            case 1:
                System.out.println("moi nhap gia tri a: ");
                int a = sc.nextInt();
                System.out.println("moi nhap gia tri b: ");
                int b = sc.nextInt();
                if (a == 0 && b == 0 ) {
                System.out.println("Phuong trinh vo so nghiem");
                }else if (a == 0 && b != 0) {
                System.out.println("Phuong trinh vo nghiem");
                }else{
                double x = (-b)/a;
                System.out.println("Gia tri cua x la: " + x);
                }
                break;
            case 2:
            int c;
            System.out.println("Nhap gia tri a: ");
            a = sc.nextInt();
            System.out.println("Nhap gia tri b: ");
            b = sc.nextInt();
            System.out.println("Nhap gia tri c: ");
            c = sc.nextInt();
            if (a == 0) {
                if (a == 0 && b == 0 ) {
                    System.out.println("Phuong trinh vo so nghiem");
                }else if (a == 0 && b != 0) {
                    System.out.println("Phuong trinh vo nghiem");
                }
            }
            else{
                double delta = b*b - 4 * a * c;
                if (delta < 0) {
                    System.out.println("pt vo nghiem");
                }
                else if (delta == 0) {
                    System.out.println("pt trinh co nghiem kep " + -b/(2*a));
                }
                else{
                    double x1 = ((-b) + Math.sqrt(delta)/(2*a));
                    double x2 =  ((-b) - Math.sqrt(delta)/(2*a));
                    System.out.printf("pt co 2 nghiem phan biet: ,x1=%.3f , x2=%.3f" , x1 ,x2);
                }
            }
                break;
            case 3:
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
                break;
            case 4: 
            System.out.println("Xin cam on");
                break;
        
            default:
                break;
        }
    }
    
}

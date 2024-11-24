import java.util.Scanner;
public class Lab2Bai4 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
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
            double delta = b*2 - 4*a*c;
            if (delta < 0) {
                System.out.println("pt vo nghiem");
            }
            else if (delta == 0) {
                System.out.println("pt trinh co nghiem kep " + -b/(2*a));
            }
            else{
                double x1 = ((-b) + Math.sqrt(delta)/(2*a));
                double x2 =  ((-b) - Math.sqrt(delta)/(2*a));
                System.out.println("pt co 2 nghiem phan biet: "+ x1 + x2);
            }
        }
    }
}

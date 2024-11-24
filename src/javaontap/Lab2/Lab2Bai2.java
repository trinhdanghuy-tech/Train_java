import java.util.Scanner;

public class Lab2Bai2 {
    public static void main(String[] args) {
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ------------------ ++");
        System.out.println("| 1. Cộng |");
        System.out.println("| 2. Trừ |");
        System.out.println("| 3. Kết thúc |");
        System.out.println("++ ------------------ ++");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lựa chọn của bạn là : ");
        int luachon = scanner.nextInt();
        switch (luachon) {
            case 1:
                System.out.println("ban da chon phep cong");
                break;
            case 2:
                System.out.println("Ban da lua chon phep tru");
                break;
            case 3:
                System.out.println("Bạn đã lựa chọn thoát chương trình");
                System.exit(0);
                break;
        
        
            default:
                System.out.println("lua chon cua ban khong hop ");
                System.exit(0);
                break;
        }
    }

}

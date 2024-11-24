package test;
import java.util.Scanner;;
public class Test1 {    
    public static void main(String[] args) {
        String [] str = {"Huy", "Hoc", "Gioi"};
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap gia tri n: ");
        n = sc.nextInt();
        for(int i =0; i < n; i++){
            System.out.println(str[i]);
        }
    }
}

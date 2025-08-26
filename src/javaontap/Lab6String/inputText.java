package javaontap.Lab6String;

import java.util.Scanner;

public class inputText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Enter Account: ");
            String account = sc.nextLine();
            System.out.print("Enter Password: ");
            String password = sc.nextLine();
            if (account.equals(account == "hoidanit") || password.length() <= 6){
                System.out.println("Yêu cầu không hợp lệ!");
                break;
            }
        }
    }
}

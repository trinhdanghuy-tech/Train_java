package GiaiBaiTap;

import java.util.ArrayList;
import java.util.Scanner;

public class DivisionBySeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();
        scanner.close();

        ArrayList<Integer> remainders = new ArrayList<>();

        while (number != 0) {
            int remainder = number % 7;
            remainders.add(remainder);
            number = number / 7;
        }

        System.out.println("Các giá trị phần dư là: " + remainders);
    }
}


package javaontap.Lab5.arrlist;

import java.util.ArrayList;
import java.util.Scanner;

public class Sumarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> arr = new ArrayList();
        while (true) {
            System.out.print("Nhập 1 số bất kì: ");
            double i = sc.nextDouble();
            arr.add(i);
            sc.nextLine();

            System.out.println("Yes or no");
            String option = sc.nextLine();
            if (option.equals("No")  || option.equals("no")) {
                break;
            }
        }
        System.out.println("Dãy gồm có: " + arr);
        double sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        System.out.println("Sum: " + sum);
    }
}

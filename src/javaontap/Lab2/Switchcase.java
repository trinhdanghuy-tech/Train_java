import java.util.Scanner;

public class Switchcase {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ban muon chon thu may: ");
        int thumay = sc.nextInt();
        switch (thumay) {
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            case 8:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Lua chon khon hop le");
                break;
        }
    }
}

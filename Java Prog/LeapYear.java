import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a NO.:");
        int y = sc.nextInt();
        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
            System.out.printf("Is a Leap Year!");
        } else {
            System.out.printf("Not a Leap Year");
        }
    }
}
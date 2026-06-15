import java.util.Scanner;

public class voteeligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Your Age :");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.printf("You are Eligible to Vote!");
        } else {
            System.out.printf("You are Not Eligible to Vote!");
        }
    }
}
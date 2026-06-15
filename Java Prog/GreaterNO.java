import java.util.Scanner;

public class GreaterNO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter 1st NO. :");
        int a = sc.nextInt();
        System.out.printf("Enter 2nd NO. :");
        int b = sc.nextInt();
        System.out.println("Enter 3rd NO. :");
        int c = sc.nextInt();
        if (a>b && a>c) {
            System.out.printf("Greater No. is : %d", a);
        } else if (b > c) {
            System.out.printf("Greater No. is : %d", b);
        } else {
            System.out.printf("Greater No. is : %d", c);
        }
    }
}
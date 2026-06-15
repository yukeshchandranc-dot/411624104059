import java.util.Scanner;

public class validTr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter A value  :");
        int a = sc.nextInt();
        System.out.printf("Enter B value  :");
        int b = sc.nextInt();
        System.out.printf("Enter C value  :");
        int c = sc.nextInt();
        if (a + b > c && b + c > a && c + a > b) {
            System.out.printf("Valid Triangle");
        }else{
            System.out.printf("Not a Valid Triangle");
        }
    }
}

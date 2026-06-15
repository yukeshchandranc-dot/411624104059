import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter First No. :");
        int a = sc.nextInt();
        System.out.printf("Enter Second No. :");
        int b = sc.nextInt();
        System.out.printf("Enter Operator :");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.printf("Sum is :" + (a + b));
                break;
            case '-':
                System.out.printf("Difference is :" + (a - b));
                break;
            case '*':
                System.out.printf("Product is :" + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.printf("Quotient is :" + (a / b));
                } else {
                    System.out.printf("Cannot divide by zero!");
                }
                break;
            default:
                System.out.printf("Invalid Operator!");
        }
    }
}
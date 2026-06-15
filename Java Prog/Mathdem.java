import java.util.Scanner;

public class Mathdem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value:");
        int a = sc.nextInt();

        System.out.println("Enter b value:");
        int b = sc.nextInt();

        System.out.println("Max: " + Math.max(a, b));
        System.out.println("Min: " + Math.min(a, b));
        System.out.println("Abs: " + Math.abs(a));
        System.out.println("Power: " + Math.pow(a, b));
        System.out.println("Ceil: " + Math.ceil(b));
        System.out.println("Floor: " + Math.floor(a));
        System.out.println("Round: " + Math.round((float) Math.pow(a, b)));
        System.out.println("Sqrt: " + Math.sqrt(a));

        sc.close();
    }
}
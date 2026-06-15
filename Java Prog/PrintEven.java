import java.util.Scanner;

public class PrintEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a NO. :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d ", i);
            }
        }
    }
}
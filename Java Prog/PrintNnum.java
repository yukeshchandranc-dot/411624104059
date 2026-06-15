import java.util.Scanner;

public class PrintNnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a NO. :");
        int n = sc.nextInt();
        for(int i=n;i>=1;i--) {
            System.out.printf("%d ", i);
        }
    }
}
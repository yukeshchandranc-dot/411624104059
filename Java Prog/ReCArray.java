import java.util.Scanner;

public class ReCArray {
    public static void main(String[] args) {
        int n = 5, c = 0;
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 2)
                c += 1;
        }System.out.println(c);
    }
}
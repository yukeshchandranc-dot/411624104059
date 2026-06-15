import java.util.Scanner;
public class Rearr{
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j++;
        } for (int k = 0; k < n; k++) {
            System.out.print(arr[k]);
        }

    }
}

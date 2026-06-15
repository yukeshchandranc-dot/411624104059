import java.util.Scanner;

public class SecMax {
    public static void main(String[] args) {
        int n = 5, max=0, smax=0;
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        } max = arr[0];
            smax = arr[0];
        for (int i = 0; i < arr.length; i++) {
           
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }System.out.print(smax);
    }
}
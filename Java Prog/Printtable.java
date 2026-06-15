import java.util.Scanner;

public class Printtable {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Enter a NO. :");
    int n=sc.nextInt();
    int i = 1;
    while(i<=12)
    {
        System.out.printf("%d X %d=%d\n", n, i, n * i);
        i++;
    }
}}
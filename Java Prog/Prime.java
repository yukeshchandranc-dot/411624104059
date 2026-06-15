import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean f=true;
        for (int i = 2; i <n; i++) {
            if (n % i == 0){
                f=false;
                break;
            }    
            else
                f=true;
        }    if (f)
                System.out.println("Is prime");
            else
                System.out.println("Not prime");
    }
}
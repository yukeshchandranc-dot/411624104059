import java.util.Scanner;
public class Methods{
    public static void main(String[] args){
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         int m=s.nextInt();
         int c=s.nextInt();
         System.out.printf("%d X %d X %d:%d",n,m,c,Mul(n,m,c));
         System.out.printf("\n%d + %d: %d",n,m,Sum(n,m));
    }public static int Mul(int a,int b,int c){
        int m=a*b*c;
        return m;

    }
    public static int Sum(int a,int b){
        int m=a+b;
        return m;

    }
}
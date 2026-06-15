import java.util.Scanner;
public class June10{
    public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
        int s=0,m,temp=n;
        while(n>0){
            m=n%10;
            s+=Math.pow(m,3);
            n/=10;

        }if(s==temp)
            System.out.println("Is amstrong.");
        else{
            System.out.println("Is not amstrong.");

        }
    }
    
}
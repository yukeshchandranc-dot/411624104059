import java.util.Scanner;
public class Array{
    public static void main(String[] args){
        int n=10;
        int[] arr=new int[n];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         for(int i:arr){
            System.out.print(arr[i]+" ");
        }
    }
}
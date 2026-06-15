import java.util.Scanner;

public class Array1 {
    public static void main(String[] args){
          int[] arr=new int[3];
        System.out.print(rev(arr));

        
    }public static int SumArray(int[] arr){
        int Sum=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
         for(int i=0;i<arr.length;i++){
          Sum+=arr[i];
        }return Sum;
    }public static int AvgArray(int[] arr){
        int Sum=0;
        
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
         for(int i=0;i<arr.length;i++){
          Sum+=arr[i];
        }int avg=Sum/arr.length;
        return avg;
    }public static int Max(int[] arr){
        int max=0;
        int n=3;
           arr=new int[n];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }return max;

    }public static int Min(int[] arr){
         int min=0;
        int n=3;
           arr=new int[n];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         for(int i=0;i<arr.length;i++){
          min=arr[0];
            if(arr[i]<min){
                min=arr[i];
            }
        }return min;

    }public static int CountEvOd(int[] arr){
    arr=new int[5];
    int e=0;
    int o=0;
     Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
         for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                e++;
            else
                o++;
            
        }return e;
        

    }public static int rev(int[] arr){
        int res;

         Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
         for(int i=arr.length-1;i>=0;i--){
           res=arr[i];
        }return res;
    }
}
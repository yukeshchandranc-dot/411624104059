public class gcd{
    public static void main(String[] args){
        int a=10,b=25;
        int gcd =1;
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0&&b%i==0){
                gcd=Math.max(gcd,i);
            }
        }System.out.print(gcd)
    }
}
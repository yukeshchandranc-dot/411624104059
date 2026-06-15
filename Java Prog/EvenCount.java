public class EvenCount{
    public static void main(String[] args){

System.out.println(ispal(121));
        
       
       
    
}
 /*public static int EvCount(int n){
            int count=0;
            while(n>0)
                {
                int r=n%10;
                if(r%2==0)
                    count++;
                 
                n/=10;
            
        }
    return count;
}*/
//  public static int CountDigit(int n){
//             int count=0;
//             while(n>0)
//                 {
//                 int r=n%10;
//                  count++;
//                  n/=10;
            
//         }
//     return count;}
 public static int rev(int n){
            int rev=0;
            while(n>0)
                {
                int r=n%10;
                rev=rev*10+r ;
                 n/=10;
            
        }
    return rev;
}

public static boolean ispal(int n){
    
    if(EvenCount.rev(n)==n){
        return true;
    }else{
        return false;
    }
    
}
public static boolean isamstrong(int n){
    int s=0;
    int t=n;
     while(n>0)
                 {
                 int r=n%10;
                s+=r*r*r;
                n=n/10;   
}return s;
}
}
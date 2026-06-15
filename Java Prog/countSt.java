import java.util.Scanner;
public class countSt{
      public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");   
        String s=sc.nextLine();
        int d=0,l=0;
      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(Character.isDigit(c)){
            d+=1;
        }else if(Character.isLetter(c)){
            l+=1;
        }
      }System.out.println("Digits:"+d);
      System.out.println("Letters:"+l);
      }
}
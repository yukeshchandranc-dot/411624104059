import java.util.Scanner;

public class countFr {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String:");
    String s = sc.nextLine();
    int co = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c=='a') {
        co++;
      }
    }
    System.out.println("Count:" + co);
  }
}
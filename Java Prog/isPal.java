import java.util.Scanner;

public class isPal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String:");
    String s = sc.nextLine();
    String rev = "";
    for (int i = s.length() - 1; i >= 0; i--) {
      char c = s.charAt(i);
      rev += c;

    }
    if (s.equalsIgnoreCase(rev)) {
      System.out.println("Is Palindrome.");
    } else
      System.out.println("Not Palindrome");
  }
}
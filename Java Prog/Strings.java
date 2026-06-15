import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String v = "aeiouAEIOU";
        int a = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            char x =s.charAt(i);
            if (x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='U'||x=='O'||x=='I'||x=='E'||x=='A') {
                a += 1;
            } else {
                c += 1;
            }
        }System.out.println("Vowel:"+a);
        System.out.println("Consonant:"+c);

    }
}
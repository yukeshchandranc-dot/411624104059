import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        int ID = 5;
        double Price = 10.5;
        char Blood = 'O';
        boolean bool = true;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = s.nextInt();
        System.out.println("Enter your name: ");
        String name = s.next();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + ID);
        System.out.println("Price: " + Price);
        System.out.println("Blood: " + Blood);
        System.out.println("Bool: " + bool);

    }
}
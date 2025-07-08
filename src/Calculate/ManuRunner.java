package Calculate;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ManuRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number1: ");
        int number1 = scanner.nextInt();


        System.out.print("Enter Number2: ");
        int number2 = scanner.nextInt();


        System.out.println("Menu:");
        System.out.println("1 - Add");
        System.out.println("2 - Substract");
        System.out.println("3 - Divide");
        System.out.println("4 - Multiply");

        System.out.println("PLease choice: ");
        int choice = scanner.nextInt();

        System.out.println("Entered number 1 is: " + number1);
        System.out.println("Entered number 2 is: " + number2);
        System.out.print("Entered operations " + choice);

        switch (choice) {
            case 1:
                System.out.println("Result: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Result: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Result: " + (number1 / number2));
                break;
            case 4:
                System.out.println("Result: " + (number1 * number2));
                break;
            default:
                System.out.println("Operation not found!");
        }
     }

}

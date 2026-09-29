import java.util.Scanner;

public class LargestTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Enter a number 1: ");
        int number1 = sc.nextInt();
        
        System.out.print("Enter a number 2: ");
        int number2 = sc.nextInt();

        if (number1 > number2) {
            System.out.println( number1 + " is largest than " + number2);
        } else {
            System.out.println( number2 + " is largest than " + number1);
        }
    }
}
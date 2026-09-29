import java.util.Scanner;

public class ArithmeticOperations {
    int a, b;

    ArithmeticOperations(int x, int y) {
        a = x;
        b = y;
    }

    void add() {
        System.out.println("Addition = " + (a + b));
    }

    void subtract() {
        System.out.println("Subtraction = " + (a - b));
    }

    void multiply() {
        System.out.println("Multiplication = " + (a * b));
    }

    void divide() {
        if (b != 0) {
            System.out.println("Division = " + (a / b));
        } else {
            System.out.println("Division is not possible (cannot divide by zero).");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();


        ArithmeticOperations obj = new ArithmeticOperations(num1, num2);

        obj.add();
        obj.subtract();
        obj.multiply();
        obj.divide();
    }
}

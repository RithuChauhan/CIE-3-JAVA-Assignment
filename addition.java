import java.util.Scanner;

public class addition {
    int a, b;
    addition() {
        this(0, 0); 
        System.out.println("Default Constructor Called");
    }

    addition(int x, int y) {
        a = x;
        b = y;
    }

    void displaySum() {
        System.out.println("Sum = " + (a + b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        addition obj = new addition(num1, num2);

        obj.displaySum();

    }
}
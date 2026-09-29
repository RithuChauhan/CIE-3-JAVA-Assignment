package package2;

import package1.calculator1;
import java.util.Scanner;

class CalculatorMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter values for n1 and n2:");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        calculator1 c = new calculator1();

        System.out.println("Sum = " + c.add(n1, n2));
    }
}


    class Addition {
    static int add(int a, int b) {
        return a + b;
    }
}

class Subtraction {
    static int subtract(int a, int b) {
        return a - b;
    }
}

class Multiplication {
    static int multiply(int a, int b) {
        return a * b;
    }
}

class Division {
    static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return (double) a / b;
    }
}

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Addition: " + Addition.add(10, 5));
        System.out.println("Subtraction: " + Subtraction.subtract(10, 5));
        System.out.println("Multiplication: " + Multiplication.multiply(10, 5));
        System.out.println("Division: " + Division.divide(10, 5));

        Addition a = new Addition();
        Subtraction s = new Subtraction();

        // Static methods can technically be called through objects,
        // but using the class name is recommended.
        System.out.println("Addition using object: " + a.add(20, 10));
        System.out.println("Subtraction using object: " + s.subtract(20, 10));
    }
}
}

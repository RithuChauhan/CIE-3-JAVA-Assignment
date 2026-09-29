class  Circle {
    double radius;
    double cost;

    Circle() {
        radius = 1.0;
        cost = 100;
    }

    Circle(double r) {
        radius = r;
        cost = 100;
    }


    Circle(double r, double c) {
        radius = r;
        cost = c;
    }

    double calculateArea() {
        return 3.14 * radius * radius;
    }

    double calculateCircumference() {
        return 2 * 3.14 * radius;
    }

    void display() {
        System.out.println("Radius = " + radius);
        System.out.println("Cost = " + cost);
        System.out.println("Area = " + calculateArea());
        System.out.println("Circumference = " + calculateCircumference());
        System.out.println();
    }

    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle(5);
        Circle c3 = new Circle(7, 250);

        System.out.println("Circle 1");
        c1.display();

        System.out.println("Circle 2");
        c2.display();

        System.out.println("Circle 3");
        c3.display();
    }
}
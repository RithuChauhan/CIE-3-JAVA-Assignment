class student {
    private int marks = 90;

    public void display() {
        System.out.println("marks = " + marks);
    }
}

public class main {
    public static void main(String[] args) {
        student s = new student();
        s.display();
    }
}
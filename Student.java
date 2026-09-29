    public class Student {
    String name;
    int age;

    Student() {
        this(100);   
        System.out.println("Default Constructor Called");
    }

    Student(int x) {
        System.out.println("Parameterized Constructor Called");
    }

    public static void main(String[] args) {
        Student s = new Student();
    }
}


public class person {
    String name;
    int age;

    person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person Constructor Called");
    }

    void displayperson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);   
        this.subject = subject;
        System.out.println("Teacher Constructor Called");
    }

    void displayTeacher() {
        displayperson();
        System.out.println("Subject: " + subject);
    }
}

 class Teach {
    public static void main(String[] args) {
        Teacher t = new Teacher("Rithu", 20, "Java");

        System.out.println("\nTeacher Details");
        t.displayTeacher();
    }
} 
    


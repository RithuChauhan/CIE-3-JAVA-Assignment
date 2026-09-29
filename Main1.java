
import java.util.Scanner;
abstract class student_details {

    protected String name;
    protected int age;

    student_details(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void displayDetails();
}
class Course {

    private int courseId;
    private String courseName;
    private int credits;

    Course(int courseId, String courseName, int credits) {

        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }

    public void displayCourse() {

        System.out.println("Course ID   : " + courseId);
        System.out.println("Course Name : " + courseName);
        System.out.println("Credits     : " + credits);
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}

class Student extends student_details {

    private int rollNo;
    private double marks;

    Course course;

    static int studentCount = 0;

    final String college = "Sri Sathya Sai Institute of Higher Learning";
    Student(int rollNo, String name, int age, double marks, Course course) {

        super(name, age);

        this.rollNo = rollNo;
        this.marks = marks;
        this.course = course;

        studentCount++;
    }


    public void displayDetails() {

        System.out.println("--------------------------------");
        System.out.println("Roll No     : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Marks       : " + marks);
        System.out.println("Grade       : " + calculateGrade());
        System.out.println("Course      : " + course.getCourseName());
        System.out.println("College     : " + college);
    }


    public String calculateGrade() {

        if (marks >= 90) {
            return "A+";
        }
        else if (marks >= 80) {
            return "A";
        }
        else if (marks >= 70) {
            return "B";
        }
        else if (marks >= 60) {
            return "C";
        }
        else if (marks >= 50) {
            return "D";
        }
        else {
            return "F";
        }
    }


    public int getRollNo() {
        return rollNo;
    }


    public String getName() {
        return name;
    }
}


class CourseManagement {

    Scanner sc = new Scanner(System.in);
    private Course c1;
    private Course c2;
    private Course c3;

    private Student s1;
    private Student s2;
    private Student s3;

    public void createCourses() {

        c1 = new Course(101, "Java Programming", 4);

        c2 = new Course( 102, "Machine Learning", 4);

        c3 = new Course( 103, "Computer Networks", 3);

        System.out.println("Three courses created successfully.");
    }

    public void displayCourses() {

        System.out.println( "\n========== COURSES ==========");
      c1.displayCourse();

        System.out.println(  "-----------------------------");


        c2.displayCourse();

        System.out.println( "-----------------------------");


        c3.displayCourse();
    }

    public Course findCourse(int courseId) {

        if (c1.getCourseId() == courseId) {
            return c1;
        }

        if (c2.getCourseId() == courseId) {
            return c2;
        }

        if (c3.getCourseId() == courseId) {
            return c3;
        }

        return null;
    }
    public void addStudent() {

        if (Student.studentCount >= 3) {

            System.out.println(  "Maximum 3 students allowed.");

            return;
        }


        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        sc.nextLine();


        System.out.print("Enter Name: ");
        String name = sc.nextLine();


        System.out.print("Enter Age: ");
        int age = sc.nextInt();


        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();


        displayCourses();


        System.out.print("Enter Course ID: ");
        int courseId = sc.nextInt();


        Course selectedCourse = findCourse(courseId);


        if (selectedCourse == null) {

            System.out.println( "Invalid Course ID.");

            return;
        }


        Student newStudent = new Student(
                rollNo,
                name,
                age,
                marks,
                selectedCourse
            );


        if (s1 == null) {

            s1 = newStudent;
        }
        else if (s2 == null) {

            s2 = newStudent;
        }
        else {

            s3 = newStudent;
        }


        System.out.println(  "Student added successfully.");
    }

    public void displayStudents() {

        if (Student.studentCount == 0) {

            System.out.println(
                "No students available."
            );

            return;
        }


        System.out.println(
            "\n========== STUDENT DETAILS =========="
        );


        if (s1 != null) {
            s1.displayDetails();
        }


        if (s2 != null) {
            s2.displayDetails();
        }


        if (s3 != null) {
            s3.displayDetails();
        }


        System.out.println(
            "=====================================");


        System.out.println(
            "Total Students: "
            + Student.studentCount
        );
    }

    public void searchStudent() {

        System.out.print(
            "Enter Roll Number to search: "
        );

        int rollNo = sc.nextInt();


        if (s1 != null &&
            s1.getRollNo() == rollNo) {

            System.out.println(
                "\nStudent Found!"
            );

            s1.displayDetails();

            return;
        }


        if (s2 != null &&
            s2.getRollNo() == rollNo) {

            System.out.println(
                "\nStudent Found!"
            );

            s2.displayDetails();

            return;
        }


        if (s3 != null &&
            s3.getRollNo() == rollNo) {

            System.out.println(
                "\nStudent Found!"
            );

            s3.displayDetails();

            return;
        }


        System.out.println(
            "Student not found."
        );
    }

    public void displayStudentCount() {

        System.out.println(
            "Total number of students: "
            + Student.studentCount
        );
    }
    public void menu() {

        int choice;

        do {

            System.out.println(
                "\n========== MENU =========="
            );

            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Display Courses");
            System.out.println("5. Display Student Count");
            System.out.println("6. Exit");


            System.out.print(
                "Enter your choice: "
            );

            choice = sc.nextInt();


            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    displayCourses();
                    break;

                case 5:
                    displayStudentCount();
                    break;

                case 6:
                    System.out.println(
                        "Program ended."
                    );
                    break;

                default:
                    System.out.println(
                        "Invalid choice."
                    );
            }

        } while (choice != 6);
    }
}

public class Main1 {

    public static void main(String[] args) {

        CourseManagement system =
            new CourseManagement();

        system.createCourses();

        system.menu();
    }
}


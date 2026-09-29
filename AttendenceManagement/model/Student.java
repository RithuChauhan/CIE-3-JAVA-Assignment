package model;

public class Student extends Person {

    private String course;
    private int semester;

    // Constructor
    public Student(int id, String name, String course, int semester) {
        super(id, name);
        this.course = course;
        this.semester = semester;
    }

    // Overriding abstract method
    @Override
    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Semester: " + semester);
        System.out.println("Department: " + department);
    }

    // Getter
    public String getCourse() {
        return course;
    }

    public int getSemester() {
        return semester;
    }

    // Setter
    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + course;
    }
}
package model;

public abstract class Person {

    protected int id;
    protected String name;

    static String collegeName = "SSSIHL";

    final String department = "Computer Science";

    // Constructor
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Abstract method
    public abstract void displayDetails();

    // Normal method
    public void showCollege() {
        System.out.println("College: " + collegeName);
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Getter for name
    public String getName() {
        return name;
    }
}
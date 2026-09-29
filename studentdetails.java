import java.util.Scanner;

public class studentdetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students (maximum 50): ");
        int n = sc.nextInt();

        if (n > 50) {
            System.out.println("Maximum 50 students are allowed.");
            return;
        }

        int validStudents = 0;
        int passStudents = 0;
        int failStudents = 0;
        int absentees = 0;
        int totalMarks = 0;

        int highestMarks = -1;
        int topperRollNo = 0;
        String topperName = "";

        for (int i = 1; i <= n; i++) {

            System.out.println("\nStudent " + i);

            System.out.print("Enter Roll Number: ");
            int rollNo = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Marks (-1 if absent): ");
            int marks = sc.nextInt();

            if (marks == -1) {
                System.out.println("Student is absent.");
                absentees++;
                continue;
            }

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid Marks! Enter marks between 0 and 100.");
                break;
            }

            validStudents++;
            totalMarks = totalMarks + marks;

            if (marks >= 35) {
                passStudents++;
                System.out.println("Result : Pass");
            } else {
                failStudents++;
                System.out.println("Result : Fail");
            }

            String grade;

            if (marks >= 90) {
                grade = "A+";
            } else if (marks >= 80) {
                grade = "A";
            } else if (marks >= 70) {
                grade = "B";
            } else if (marks >= 60) {
                grade = "C";
            } else if (marks >= 50) {
                grade = "D";
            } else if (marks >= 35) {
                grade = "E";
            } else {
                grade = "Fail";
            }

            if (marks > highestMarks) {
                highestMarks = marks;
                topperRollNo = rollNo;
                topperName = name;
            }

            System.out.println("Roll Number : " + rollNo);
            System.out.println("Name        : " + name);
            System.out.println("Marks       : " + marks);
            System.out.println("Grade       : " + grade);
        }

        double average = 0;

        if (validStudents > 0) {
            average = (double) totalMarks / validStudents;
        }

        System.out.println("========== CLASS REPORT ==========");
        System.out.println("Valid Students : " + validStudents);
        System.out.println("Pass Students  : " + passStudents);
        System.out.println("Fail Students  : " + failStudents);
        System.out.println("Absentees      : " + absentees);
        System.out.println("Class Average  : " + average);

        if (validStudents > 0) {
            System.out.println("========== TOPPER DETAILS ==========");
            System.out.println("Roll Number : " + topperRollNo);
            System.out.println("Name        : " + topperName);
            System.out.println("Highest Marks : " + highestMarks);
        } else {
            System.out.println("No valid students to determine topper.");
        }
    }
}
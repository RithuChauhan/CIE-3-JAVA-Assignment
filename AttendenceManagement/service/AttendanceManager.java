package service;

import java.util.ArrayList;
import model.AttendanceRecord;
import model.Student;

public class AttendanceManager {

    private ArrayList<Student> students;
    private ArrayList<AttendanceRecord> attendanceRecords;

    // Constructor
    public AttendanceManager() {
        students = new ArrayList<>();
        attendanceRecords = new ArrayList<>();
    }

    // Add student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Get all students
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void markAttendance(Student student, String date,
            String month, boolean present)
            throws exceptions.InvalidAttendanceException {

        if (student == null) {
            throw new exceptions.InvalidAttendanceException(
                    "Student does not exist.");
        }

        if (date == null || date.isEmpty()) {
            throw new exceptions.InvalidAttendanceException(
                    "Date cannot be empty.");
        }

        if (month == null || month.isEmpty()) {
            throw new exceptions.InvalidAttendanceException(
                    "Month cannot be empty.");
        }

        AttendanceRecord record = new AttendanceRecord(student, date, month, present);

        attendanceRecords.add(record);
    }

    // Get all attendance records
    public ArrayList<AttendanceRecord> getAttendanceRecords() {
        return attendanceRecords;
    }

    // Find student using ID
    public Student findStudent(int id) {

        for (Student student : students) {

            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

    // Calculate present days
    public int getPresentDays(Student student) {

        int present = 0;

        for (AttendanceRecord record : attendanceRecords) {

            if (record.getStudent().equals(student)
                    && record.isPresent()) {

                present++;
            }
        }

        return present;
    }

    // Calculate absent days
    public int getAbsentDays(Student student) {

        int absent = 0;

        for (AttendanceRecord record : attendanceRecords) {

            if (record.getStudent().equals(student)
                    && !record.isPresent()) {

                absent++;
            }
        }

        return absent;
    }

    // Calculate total working days
    public int getTotalDays(Student student) {

        int total = 0;

        for (AttendanceRecord record : attendanceRecords) {

            if (record.getStudent().equals(student)) {
                total++;
            }
        }

        return total;
    }

    // Calculate attendance percentage
    public double calculateAttendance(Student student) {

        int total = getTotalDays(student);
        int present = getPresentDays(student);

        if (total == 0) {
            return 0;
        }

        return ((double) present / total) * 100;
    }

    // Display complete class report
    public void displayReport() {

        for (Student student : students) {

            int present = getPresentDays(student);
            int absent = getAbsentDays(student);
            double percentage = calculateAttendance(student);

            System.out.println("--------------------------------");
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Present: " + present);
            System.out.println("Absent: " + absent);
            System.out.printf("Attendance: %.2f%%\n", percentage);
        }
    }
}
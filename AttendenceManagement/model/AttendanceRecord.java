package model;

public class AttendanceRecord {

    private Student student;
    private String date;
    private String month;
    private boolean present;

    // Constructor
    public AttendanceRecord(Student student, String date, String month, boolean present) {
        this.student = student;
        this.date = date;
        this.month = month;
        this.present = present;
    }

    // Getters
    public Student getStudent() {
        return student;
    }

    public String getDate() {
        return date;
    }

    public String getMonth() {
        return month;
    }

    public boolean isPresent() {
        return present;
    }

    // Setter
    public void setPresent(boolean present) {
        this.present = present;
    }

    @Override
    public String toString() {
        String status;

        if (present) {
            status = "Present";
        } else {
            status = "Absent";
        }

        return student.getId() + " - "
                + student.getName() + " - "
                + date + " - "
                + month + " - "
                + status;
    }
}
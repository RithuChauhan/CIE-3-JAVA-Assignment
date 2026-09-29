class mydetails {

    mydetails() {
        System.out.println("\n===== STUDENT PERSONAL DETAILS =====");
        System.out.println("Name   : Rithu");
        System.out.println("Age    : 19");
        System.out.println("Gender : Female");
    }

    mydetails(String course, String college) {
        System.out.println("\n===== STUDENT ACADEMIC DETAILS =====");
        System.out.println("Course  : " + course);
        System.out.println("College : " + college);
    }

    mydetails(String city, String state, long phone) {
        System.out.println("\n===== STUDENT CONTACT DETAILS =====");
        System.out.println("City    : " + city);
        System.out.println("State   : " + state);
        System.out.println("Phone   : " + phone);
    }

    public static void main(String[] args) {

        mydetails s1 = new mydetails();

        mydetails s2 = new mydetails(
                "B.Sc Computer Science",
                "Sri Sathya Sai Institute of Higher Learning");

        mydetails s3 = new mydetails(
                "Anantapur",
                "Andhra Pradesh",
                9876543210L);
    }
}
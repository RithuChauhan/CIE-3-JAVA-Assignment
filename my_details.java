    import java.util.Scanner;

public class my_details {

    my_details() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your roll_no: ");
         long roll_no = sc.nextLong();

         sc.nextLine();
        System.out.print("Enter your department: ");
        String department = sc.nextLine();

        
        System.out.print("Enter your percentage: ");
         int percentage = sc.nextInt();

        System.out.println("-----My details---- " );         
        System.out.println("name " + name);
         System.out.println("roll_no: " + roll_no);
          System.out.println("department: " + department );
          System.out.println("percentage:" + percentage);

    }

    public static void main(String[] args) {
        my_details obj = new my_details();
    }
}


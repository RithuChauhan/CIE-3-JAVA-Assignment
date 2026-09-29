import java.util.Scanner;

public class librarydetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bookId = 0;
        String bookName = "";
        String author = "";
        int copies = 0;

        int choice;

        do {

            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Search Book");
            System.out.println("5. Display Book Details");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Book ID: ");
                    bookId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    bookName = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    author = sc.nextLine();

                    System.out.print("Enter Number of Copies: ");
                    copies = sc.nextInt();

                    System.out.println("Book added successfully.");
                    break;

                case 2:

                    if (bookId == 0) {
                        System.out.println("No book has been added.");
                        break;
                    }

                    System.out.print("Enter Book ID to Issue: ");
                    int issueId = sc.nextInt();

                    if (issueId == bookId) {

                        if (copies > 0) {
                            copies--;
                            System.out.println("Book issued successfully.");
                        } else {
                            System.out.println("Book is not available.");
                        }

                    } else {
                        System.out.println("Book not found.");
                    }

                    break;

                case 3:

                    if (bookId == 0) {
                        System.out.println("No book has been added.");
                        break;
                    }

                    System.out.print("Enter Book ID to Return: ");
                    int returnId = sc.nextInt();

                    if (returnId == bookId) {
                        copies++;
                        System.out.println("Book returned successfully.");
                    } else {
                        System.out.println("Book not found.");
                    }

                    break;

                case 4:

                    if (bookId == 0) {
                        System.out.println("No book has been added.");
                        break;
                    }

                    System.out.print("Enter Book ID to Search: ");
                    int searchId = sc.nextInt();

                    if (searchId == bookId) {
                        System.out.println("\nBook Found");
                        System.out.println("Book ID          : " + bookId);
                        System.out.println("Book Name        : " + bookName);
                        System.out.println("Author           : " + author);
                        System.out.println("Available Copies : " + copies);
                    } else {
                        System.out.println("Book not found.");
                    }

                    break;

                case 5:

                    if (bookId == 0) {
                        System.out.println("No book available.");
                    } else {
                        System.out.println("1 BOOK DETAILS ");
                        System.out.println("Book ID          : " + bookId);
                        System.out.println("Book Name        : " + bookName);
                        System.out.println("Author           : " + author);
                        System.out.println("Available Copies : " + copies);
                    }

                    break;

                case 6:

                    System.out.println("Application terminated.");
                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
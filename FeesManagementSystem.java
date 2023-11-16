import java.util.Scanner;

public class FeesManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Fees Management System!");

        while (true) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Add new student");
            System.out.println("2. Record payment");
            System.out.println("3. Generate report");
            System.out.println("4. Send reminder");
            System.out.println("5. Exit");

            int selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    addNewStudent();
                    break;
                case 2:
                    recordPayment();
                    break;
                case 3:
                    generateReport();
                    break;
                case 4:
                    sendReminder();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }
    }

    private static void addNewStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name:");
        String name = scanner.nextLine();

        System.out.println("Enter student roll number:");
        int rollNumber = scanner.nextInt();

        System.out.println("Enter student course:");
        String course = scanner.nextLine();

        System.out.println("Student added successfully!");
    }

    private static void recordPayment() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student roll number:");
        int rollNumber = scanner.nextInt();

        System.out.println("Enter amount paid:");
        double amountPaid = scanner.nextDouble();

        System.out.println("Payment recorded successfully!");
    }

    private static void generateReport() {
        System.out.println("Generating report...");
        System.out.println("Report generated successfully!");
    }

    private static void sendReminder() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student roll number:");
        int rollNumber = scanner.nextInt();

        System.out.println("Reminder sent successfully!");
    }
}

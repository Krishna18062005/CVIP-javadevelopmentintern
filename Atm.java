import java.util.Scanner;

public class Atm {

    private static int balance = 10000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to ATM!");
            System.out.println("Please enter your PIN:");

            String pass = scanner.nextLine();

            if (!pass.equals("1234")) {
                System.out.println("Incorrect PIN. Please try again.");
                continue;
            }

            System.out.println("Main Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    withdraw(scanner);
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using ATM!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void withdraw(Scanner scanner) {
        System.out.println("Enter amount to withdraw:");
        int amount = scanner.nextInt();

        if (amount > balance) {
            System.out.println("Insufficient funds. Please enter a lower amount.");
        } else {
            balance -= amount;
            System.out.println("You have withdrawn " + amount + ". Your remaining balance is " + balance);
        }
    }

    private static void deposit(Scanner scanner) {
        System.out.println("Enter amount to deposit:");
        int amount = scanner.nextInt();

        balance += amount;
        System.out.println("You have deposited " + amount + ". Your new balance is " + balance);
    }

    private static void checkBalance() {
        System.out.println("Your current balance is " + balance);
    }
}

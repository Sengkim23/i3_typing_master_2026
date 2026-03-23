import java.util.Scanner;

public class welcome_menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("------ Welcome to I3 Typing Master v2026 ----------");
            System.out.println("To begin, please select one of the following options:");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Typing Test");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    typingTest();
                    break;
                case 4:
                    System.out.println("Exiting program... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }

            System.out.println(); // space line

        } while (choice != 4);

        sc.close();
    }

    // Login function
    public static void login() {
        System.out.println("=== Login Page ===");
        System.out.println("This is where user logs in.");
    }

    // Register function
    public static void register() {
        System.out.println("=== Register Page ===");
        System.out.println("This is where user creates an account.");
    }

    // Typing test function
    public static void typingTest() {
        System.out.println("=== Typing Test ===");
        System.out.println("Typing test will be implemented here.");
    }

}

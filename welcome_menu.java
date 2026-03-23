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
            System.out.println("3. About Us");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    login.start(sc);        // friend
                    break;
                case 2:
                    register.start(sc);     // friend
                    break;
                case 3:
                    aboutUs.show(sc);       // you
                    break;
                case 4:
                    System.out.println("Exiting program... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }

            System.out.println();

        } while (choice != 4);

        sc.close();
    }
}
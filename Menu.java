import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuChoice;
        Customer customer = new Customer();
        Event event = new Event();

        do {
            displayMenu();
            menuChoice = scanner.nextInt();

            switch (menuChoice) {
                case 1:
                    customer.signUp();
                    break;
                case 2:
                    Login login = new Login();
                    boolean isAuthenticated = login.loginAndInfo(customer);
                    if (isAuthenticated) {
                        System.out.println("Login successful!");
                    } else {
                        System.out.println("Login failed. Please try again.");
                    }
                    break;
                case 3:
                    event.displayAllEvents();
                    break;
                case 4:
                    TicketPrinter ticketPrinter = new TicketPrinter();
                    ticketPrinter.displayTicketMenu(customer);
                    break;
                case 5:
                    System.out.println("Exiting the menu");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (menuChoice != 5);

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("1. Sign Up");
        System.out.println("2. Login");
        System.out.println("3. Events");
        System.out.println("4. Tickets and prices");
        System.out.println("5. Exit");
        System.out.print("Please pick an option: ");
    }
}

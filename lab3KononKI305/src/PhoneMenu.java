// PhoneMenu.java
import java.util.Scanner;

public class PhoneMenu {
    private Phone phone;

    public PhoneMenu(Phone phone) {
        this.phone = phone;
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Make a call");
            System.out.println("2. Send a message");
            System.out.println("3. Display call history");
            System.out.println("4. Display messages");
            System.out.println("5. Display full phone information");
            System.out.println("6. Power off");
            System.out.print("Enter your choice (1-6): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    phone.makeCall();
                    break;
                case 2:
                    phone.sendMessage();
                    break;
                case 3:
                    phone.displayCallHistory();
                    break;
                case 4:
                    phone.displayMessages();
                    break;
                case 5:
                    phone.displayFullInfo();
                    break;
                case 6:
                    phone.powerOff();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        } while (choice != 6);
    }
}

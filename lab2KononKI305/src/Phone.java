// Phone.java
import java.util.Scanner;
public class Phone {
    private String brand;
    private String model;
    private int batteryLevel;
    private boolean powerOn;
    private CallHistory callHistory;
    private Messaging messaging;
    //
    // Default constructor
    public Phone() {
        brand = "Unknown";
        model = "Unknown";
        batteryLevel = 50;
        powerOn = false;
        callHistory = new CallHistory();
        messaging = new Messaging();
    }

    // Constructor with parameters
    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
        batteryLevel = 100;
        powerOn = false;
        callHistory = new CallHistory();
        messaging = new Messaging();
    }

    // Display full information about the phone
    public void displayFullInfo() {
        System.out.println("Phone Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery Level: " + batteryLevel + "%");
        System.out.println("Power On: " + (powerOn ? "Yes" : "No"));
    }
    public void inputPhoneData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter brand: ");
        this.brand = scanner.nextLine();
        System.out.print("Enter model: ");
        this.model = scanner.nextLine();
    }

    public void addBatteryCharge(int charge) {
        if (powerOn) {
            batteryLevel = Math.min(100, batteryLevel + charge);
            System.out.println("Battery charged. Current battery level: " + batteryLevel + "%");
        } else {
            System.out.println("Cannot charge the battery. Phone is turned off.");
        }
    }
    public void subBatteryCharge(int charge) {
        if (powerOn) {
            batteryLevel = Math.min(100, batteryLevel - charge);
            System.out.println("Battery uncharged. Current battery level: " + batteryLevel + "%");
        } else {
            System.out.println("Cannot charge the battery. Phone is turned off.");
        }
    }
    // Power on the phone
    public void powerOn() {
        System.out.println(brand + " " + model + " is powering on.");
        powerOn = true;
    }

    // Power off the phone
    public void powerOff() {
        System.out.println(brand + " " + model + " is powering off.");
        powerOn = false;
    }

    // Check if the phone is powered on
    public boolean isPowerOn() {
        return powerOn;
    }

    // Make a call
    public void makeCall(String phoneNumber) {
        if (powerOn) {
            System.out.println("Calling " + phoneNumber + "...");
            callHistory.addCall(phoneNumber);
            decreaseBatteryLevel();
        } else {
            System.out.println("Phone is powered off. Cannot make a call.");
        }
    }

    // Receive a call
    public void receiveCall(String phoneNumber) {
        if (powerOn) {
            System.out.println("Incoming call from " + phoneNumber);
            callHistory.addCall(phoneNumber);
            decreaseBatteryLevel();
        } else {
            System.out.println("Phone is powered off. Cannot receive a call.");
        }
    }

    // Send a message
    public void sendMessage(String phoneNumber, String message) {
        if (powerOn) {
            System.out.println("Sending message to " + phoneNumber + ": " + message);
            messaging.addMessage(phoneNumber, message);
            decreaseBatteryLevel();
        } else {
            System.out.println("Phone is powered off. Cannot send a message.");
        }
    }

    // Check battery level
    public int checkBatteryLevel() {
        return batteryLevel;
    }

    // Decrease battery level after a certain action
    private void decreaseBatteryLevel() {
        batteryLevel -= 5;
        System.out.println("Battery level: " + batteryLevel + "%");
    }


    // Display call history
    public void displayCallHistory() {
        callHistory.displayCallHistory();
    }

    // Display messages
    public void displayMessages() {
        messaging.displayMessages();
    }
    public void makeCall() {
        if (powerOn) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter phone number to call: ");
            String phoneNumber = scanner.nextLine();
            System.out.println("Calling " + phoneNumber + "...");
            callHistory.addCall(phoneNumber);
            decreaseBatteryLevel();
        } else {
            System.out.println("Phone is powered off. Cannot make a call.");
        }
    }

    // Send a message by taking phone number and message from user input
    public void sendMessage() {
        if (powerOn) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter phone number to send a message: ");
            String phoneNumber = scanner.nextLine();
            System.out.print("Enter message: ");
            String message = scanner.nextLine();
            System.out.println("Sending message to " + phoneNumber + ": " + message);
            messaging.addMessage(phoneNumber, message);
            decreaseBatteryLevel();
        } else {
            System.out.println("Phone is powered off. Cannot send a message.");
        }
    }
}

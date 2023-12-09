// SmartPhone.java
import java.util.Scanner;

public class SmartPhone extends Phone implements InternetConnectable {
    private boolean internetConnected;

    // Default constructor
    public SmartPhone() {
        super();
        internetConnected = false;
    }

    // Constructor with parameters
    public SmartPhone(String brand, String model) {
        super(brand, model);
        internetConnected = false;
    }

    // Implementing the InternetConnectable interface
    @Override
    public void connectToInternet() {
        if (isPowerOn()) {
            System.out.println("Connecting to the Internet...");
            internetConnected = true;
        } else {
            System.out.println("Cannot connect to the Internet. Phone is powered off.");
        }
    }

    // Override the makeCall method to include internet connection check
    @Override
    public void makeCall(String phoneNumber) {
        if (internetConnected) {
            super.makeCall(phoneNumber);
        } else {
            System.out.println("Cannot make a call. No Internet connection.");
        }
    }

    // Override the sendMessage method to include internet connection check
    @Override
    public void sendMessage(String phoneNumber, String message) {
        if (internetConnected) {
            super.sendMessage(phoneNumber, message);
        } else {
            System.out.println("Cannot send a message. No Internet connection.");
        }
    }

    // Additional methods specific to SmartPhone can be added here

    // Getter for internetConnected
    public boolean isInternetConnected() {
        return internetConnected;
    }
    @Override
    public boolean supportsInternet() {
        return true;
    }
}
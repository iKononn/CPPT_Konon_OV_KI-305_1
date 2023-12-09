// Messaging.java
import java.util.HashMap;
import java.util.Map;

public class Messaging {
    private Map<String, String> messages;

    // Default constructor
    public Messaging() {
        messages = new HashMap<>();
    }

    // Add message to the map
    public void addMessage(String phoneNumber, String message) {
        messages.put(phoneNumber, message);
        System.out.println("Message sent to " + phoneNumber + ": " + message);
    }

    // Display all messages
    public void displayMessages() {
        System.out.println("Messages:");
        for (Map.Entry<String, String> entry : messages.entrySet()) {
            System.out.println("To: " + entry.getKey() + ", Message: " + entry.getValue());
        }
    }
}

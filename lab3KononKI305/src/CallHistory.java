// CallHistory.java
import java.util.ArrayList;
import java.util.List;

public class CallHistory {
    private List<String> callHistory;

    // Default constructor
    public CallHistory() {
        callHistory = new ArrayList<>();
    }

    // Add call to the history
    public void addCall(String phoneNumber) {
        callHistory.add(phoneNumber);
        System.out.println("Call added to history: " + phoneNumber);
    }

    // Display call history
    public void displayCallHistory() {
        System.out.println("Call History:");
        for (String call : callHistory) {
            System.out.println(call);
        }
    }
}

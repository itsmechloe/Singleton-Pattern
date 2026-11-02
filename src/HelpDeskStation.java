public class HelpDeskStation {
    private final String stationName;
    private final QueuingSystem queuingSystem;

    public HelpDeskStation(String stationName) {
        this.stationName = stationName;
        this.queuingSystem = QueuingSystem.getInstance();
    }

    public void serveNextCustomer() {
        int queueNumber = queuingSystem.getNextQueueNumber();
        System.out.println("[" + stationName + "] Now serving queue number: " + queueNumber);
    }

    public void resetQueue(int newNumber) {
        System.out.println("[" + stationName + "] Initiating queue reset to: " + newNumber);
        queuingSystem.resetQueueNumber(newNumber);
    }

    public void displayCurrentQueue() {
        System.out.println("[" + stationName + "] Current centralized queue number: " + queuingSystem.getCurrentQueueNumber());
    }

    public String getStationName() {
        return stationName;
    }
}

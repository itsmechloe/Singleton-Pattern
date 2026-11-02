public class QueuingSystem {
    private static QueuingSystem instance;
    private int currentQueueNumber;

    private QueuingSystem() {
        this.currentQueueNumber = 0;
    }

    public static synchronized QueuingSystem getInstance() {
        if (instance == null) {
            instance = new QueuingSystem();
        }
        return instance;
    }

    public synchronized int getNextQueueNumber() {
        return ++currentQueueNumber;
    }

    public synchronized int getCurrentQueueNumber() {
        return currentQueueNumber;
    }

    public synchronized void resetQueueNumber(int newNumber) {
        if (newNumber < 0) {
            System.out.println("[Queuing System] Error: Queue number cannot be negative.");
            return;
        }
        this.currentQueueNumber = newNumber;
        System.out.println("[Queuing System] Centralized queue number has been reset to: " + this.currentQueueNumber);
    }
}

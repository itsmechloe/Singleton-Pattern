public class OnlineMonitoringSystem {
    private final QueuingSystem queuingSystem;

    public OnlineMonitoringSystem() {
        this.queuingSystem = QueuingSystem.getInstance();
    }

    public void displayCurrentQueue() {
        System.out.println("[Online Monitoring System] Live Real-Time Queue Number: " + queuingSystem.getCurrentQueueNumber());
    }
}

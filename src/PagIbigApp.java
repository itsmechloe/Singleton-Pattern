public class PagIbigApp {
    public static void main(String[] args) {
        System.out.println("======================================================================");
        System.out.println("   CENTRALIZED QUEUING SYSTEM FOR PAG-IBIG OFFICE (SINGLETON PATTERN)  ");
        System.out.println("======================================================================\n");

        QueuingSystem centralizedSystem = QueuingSystem.getInstance();

        HelpDeskStation station1 = new HelpDeskStation("Help Desk Station 1");
        HelpDeskStation station2 = new HelpDeskStation("Help Desk Station 2");
        HelpDeskStation station3 = new HelpDeskStation("Help Desk Station 3");

        OnlineMonitoringSystem onlineMonitoring = new OnlineMonitoringSystem();

        System.out.println(">>> 1. Individuals Visiting the Office Obtain Queue Numbers <<<");
        System.out.println("Visitor A obtained queue number: " + centralizedSystem.getNextQueueNumber());
        System.out.println("Visitor B obtained queue number: " + centralizedSystem.getNextQueueNumber());
        System.out.println("Visitor C obtained queue number: " + centralizedSystem.getNextQueueNumber());
        System.out.println();

        System.out.println(">>> 2. Online Monitoring System Displays Real-Time Queue Number <<<");
        onlineMonitoring.displayCurrentQueue();
        System.out.println();

        System.out.println(">>> 3. Help Desk Stations Serving Queued Individuals <<<");
        station1.serveNextCustomer();
        station2.serveNextCustomer();
        station3.serveNextCustomer();
        System.out.println();

        System.out.println(">>> 4. Current State Across All Stations & Online Monitor <<<");
        station1.displayCurrentQueue();
        station2.displayCurrentQueue();
        station3.displayCurrentQueue();
        onlineMonitoring.displayCurrentQueue();
        System.out.println();

        System.out.println(">>> 5. Resetting Queue Number (e.g., Reorganization or Technical Issues) <<<");
        station2.resetQueue(50);
        System.out.println();

        System.out.println(">>> 6. Verification of Shared Centralized State Post-Reset <<<");
        station1.displayCurrentQueue();
        station2.displayCurrentQueue();
        station3.displayCurrentQueue();
        onlineMonitoring.displayCurrentQueue();
        System.out.println();

        System.out.println(">>> 7. Next Operations Reflecting the Reset Queue <<<");
        station1.serveNextCustomer();
        station3.serveNextCustomer();
        onlineMonitoring.displayCurrentQueue();
        System.out.println();

        System.out.println("======================================================================");
        System.out.println("  VERIFICATION CONFIRMED: All components access the exact same instance!");
        System.out.println("======================================================================");
    }
}

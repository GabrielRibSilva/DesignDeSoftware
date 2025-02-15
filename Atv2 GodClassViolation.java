
public class GodClassViolation {
    public static void main(String[] args) {
        Application app = new Application();
        app.authenticateUser();
        app.loadDashboard();
        app.processPayments();
        app.generateReports();
    }
}

class Application {
    public void authenticateUser() {
        System.out.println("Authenticating user...");
    }

    public void loadDashboard() {
        System.out.println("Loading dashboard...");
    }

    public void processPayments() {
        System.out.println("Processing payments...");
    }

    public void generateReports() {
        System.out.println("Generating reports...");
    }
}

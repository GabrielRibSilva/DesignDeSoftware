public class SRPCompliantApp  {
    public static void main(String[] args) {
        ApplicationController appController = new ApplicationController();
        appController.run();
    }
}

class ApplicationController {
    private final UserAuthenticator authenticator = new UserAuthenticator();
    private final DashboardLoader dashboardLoader = new DashboardLoader();
    private final PaymentProcessor paymentProcessor = new PaymentProcessor();
    private final ReportGenerator reportGenerator = new ReportGenerator();

    public void run() {
        authenticator.authenticateUser();
        dashboardLoader.loadDashboard();
        paymentProcessor.processPayments();
        reportGenerator.generateReports();
    }
}

class UserAuthenticator {
    public void authenticateUser() {
        System.out.println("Authenticating user...");
    }
}

class DashboardLoader {
    public void loadDashboard() {
        System.out.println("Loading dashboard...");
    }
}

class PaymentProcessor {
    public void processPayments() {
        System.out.println("Processing payments...");
    }
}

class ReportGenerator {
    public void generateReports() {
        System.out.println("Generating reports...");
    }
}
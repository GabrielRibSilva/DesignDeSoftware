public class GodClassViolation {
    public static void main(String[] args) {
        UserAuthenticator authenticator = new UserAuthenticator();
        DashboardLoader dashboardLoader = new DashboardLoader();
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        ReportGenerator reportGenerator = new ReportGenerator();

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
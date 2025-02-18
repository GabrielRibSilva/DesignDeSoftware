public class DIPCompliant {
    public static void main(String[] args) {
        IReportGenerator reportGenerator = new GeneratePDF(); 
        reportGenerator.generateReport();
    }
}

interface IReportGenerator {
    void generateReport();
}

class GeneratePDF implements IReportGenerator {
    public void generateReport() {
        System.out.println("Generating PDF Report...");
    }
}

class GenerateCSV implements IReportGenerator {
    public void generateReport() {
        System.out.println("Generating CSV Report...");
    }
}
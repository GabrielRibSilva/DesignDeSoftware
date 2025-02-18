public class HardCodedDependencies {
    public static void main(String[] args) {
        GeneratePDF pdf = new generatePDF();
        pdf.Report();
    }
}

class GeneratePDF {
    public void Report() {
        System.out.println("Generating PDF Report...");
    }
}

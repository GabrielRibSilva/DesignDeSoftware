# Atividade 3 - HardCodedDependencies
##### É uma classe na qual tem nomenclatura redundante
```java
public class HardCodedDependencies {
    public static void main(String[] args) {
        Report report = new Report();
        report.generatePDFReport();
    }
}

class Report {
    public void generatePDFReport() {
        System.out.println("Generating PDF Report...");
    }
}
```
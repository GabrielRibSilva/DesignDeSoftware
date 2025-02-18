public class InterfaceSegregationViolation {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
        printer.scan();
        printer.fax();
    }
}

class Printer {
    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        System.out.println("Scanning...");
    }

    public void fax() {
        System.out.println("Faxing...");
    }
}

public class ISPCompliant {
    public static void main(String[] args) {
        BasicPrinter basicPrinter = new BasicPrinter();
        basicPrinter.print();

        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.print();
        mfp.scan();
        mfp.fax();
    }
}

interface IPrinter {
    void print();
}

interface IScanner {
    void scan();
}

interface IFax {
    void fax();
}

class BasicPrinter implements IPrinter {
    public void print() {
        System.out.println("Printing...");
    }
}

class MultiFunctionPrinter implements IPrinter, IScanner, IFax {
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

class ScannerDevice implements IScanner {
    public void scan() {
        System.out.println("Scanning...");
    }
}
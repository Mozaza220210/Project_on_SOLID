//*************************************************************************
// TITLE : A JAVA PROGRAMME TO DEMOSTRATE INTERFACE SEGREGATION PRINCIPLE .
// AUTHOR : MOZAZA AL ZAMAN, UNDERGRADUATE STUDENT (2ND YEAR) Of KHULNA UNIVERSITY
//*************************************************************************
/**
 * Interface for devices with printing capability.
 */
interface Printer {
    /**
     * Prints a document.
     */
    void print();
}

/**
 * Interface for devices with scanning capability.
 */
interface Scanner {
    /**
     * Scans a document.
     */
    void scan();
}

/**
 * Multi-function device with both printing and scanning capabilities.
 */
class MultiFunctionDevice implements Printer, Scanner {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }
}

/**
 * Simple printer device with only printing capability.
 */
class SimplePrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing...");
    }
}

/**
 * Main class to demonstrate the Interface Segregation Principle.
 */
public class ISPExample {
    /**
     * Method to print using any device that implements the Printer interface.
     * 
     * @param printer the printer device
     */
    public static void printDocument(Printer printer) {
        printer.print();
    }

    /**
     * Method to scan using any device that implements the Scanner interface.
     * 
     * @param scanner the scanner device
     */
    public static void scanDocument(Scanner scanner) {
        scanner.scan();
    }

    public static void main(String[] args) {
        // Using MultiFunctionDevice
        MultiFunctionDevice mfd = new MultiFunctionDevice();
        printDocument(mfd);
        scanDocument(mfd);

        // Using SimplePrinter
        SimplePrinter printer = new SimplePrinter();
        printDocument(printer);
    }
}

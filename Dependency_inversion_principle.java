//*************************************************************************
// TITLE : A JAVA PROGRAMME TO DEMOSTRATE DEPENDENCY INVERSION PRINCIPLE .
// AUTHOR : MOZAZA AL ZAMAN, UNDERGRADUATE STUDENT (2ND YEAR) Of KHULNA UNIVERSITY
//*************************************************************************
/**
 * Interface for reading data.
 */
interface Reader {
    /**
     * Reads data.
     * 
     * @return the read data
     */
    String read();
}

/**
 * Class representing reading data from a keyboard.
 */
class KeyboardReader implements Reader {
    @Override
    public String read() {
        // Simulate reading input from keyboard
        return "Keyboard input";
    }
}

/**
 * Class representing reading data from a file.
 */
class FileReader implements Reader {
    @Override
    public String read() {
        // Simulate reading input from file
        return "File input";
    }
}

/**
 * Class that depends on the Reader interface.
 */
class DataManager {
    private Reader reader;

    /**
     * Constructs a DataManager with the specified reader.
     * 
     * @param reader the reader to use
     */
    public DataManager(Reader reader) {
        this.reader = reader;
    }

    /**
     * Fetches data using the provided reader.
     * 
     * @return the fetched data
     */
    public String fetchData() {
        return reader.read();
    }
}

/**
 * Main class to demonstrate the Dependency Inversion Principle.
 */
public class DIPExample {
    public static void main(String[] args) {
        // Create a DataManager that reads from keyboard
        Reader keyboardReader = new KeyboardReader();
        DataManager dataManager1 = new DataManager(keyboardReader);
        String data1 = dataManager1.fetchData();
        System.out.println("Data from keyboard: " + data1);

        // Create a DataManager that reads from file
        Reader fileReader = new FileReader();
        DataManager dataManager2 = new DataManager(fileReader);
        String data2 = dataManager2.fetchData();
        System.out.println("Data from file: " + data2);
    }
}

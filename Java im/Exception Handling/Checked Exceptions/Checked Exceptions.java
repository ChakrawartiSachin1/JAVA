import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Code that may throw a checked exception
            FileReader fileReader = new FileReader("file.txt");
            // Other code that may throw IOException
        } catch (IOException e) {
            // Handle the IOException
            e.printStackTrace();
        }
    }
}

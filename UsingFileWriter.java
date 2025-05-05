import java.io.FileWriter;
import java.io.IOException;
public class UsingFileWriter {
    public static void main(String[] args) {
        
        try {
            FileWriter fileWriter = new FileWriter("faisal.txt");
            fileWriter.write("Hello Faisal");
            fileWriter.flush();
            fileWriter.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
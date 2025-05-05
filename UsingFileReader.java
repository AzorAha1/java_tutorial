import java.io.File;
import java.io.FileReader;
public class UsingFileReader {

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("faisal.txt");
            // int i = fileReader.read();
            // while (i != -1) {
            //     System.out.print((char)i);
            //     i = fileReader.read();
            //another method
            char [] buffer = new char[20];
            fileReader.read(buffer);
            System.out.println(buffer);
            fileReader.close();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("An error occurred.");
            
        }
    }
}
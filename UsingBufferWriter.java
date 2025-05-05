import java.io.BufferedWriter;
import java.io.FileWriter;
public class UsingBufferWriter {

    public static void main(String[] arags) {
        try {
            // create a FileWriter object
            FileWriter fileWriter = new FileWriter("faisal.txt");
            // create a BufferedWriter object
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            // write string to the file
            bufferedWriter.write("Hello Faisal 3");
            // adding a new lin
            bufferedWriter.newLine();
            // write string to the file
            bufferedWriter.write("Hello Faisal 4");
            //another method
            bufferedWriter.newLine();
            bufferedWriter.write("Hello Faisal", 0, 5);
            // flush the BufferedWriter
            bufferedWriter.flush();
        }
        catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferedReader {

    public static void main(String[] args) {
        try 
        {
            //create filereader first 
            FileReader fileReader = new FileReader("faisal.txt");
            //create buffered reader and wrap it around filereader
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            // first method read line by line
            // int i = bufferedReader.read();
            // while(i != -1) {
            //     System.out.print((char)i);
            //     i = bufferedReader.read();
            // }
            // another method read line by line
            // String line = bufferedReader.readLine();
            // while(line != null) {
            //     System.out.println(line);
            //     line = bufferedReader.readLine();
            // }
            //reading with help of array
            char [] buffer = new char[20];
            bufferedReader.read(buffer);
            System.out.println(buffer);
            
            bufferedReader.close();
        }
        catch (IOException e){
            System.out.println("An error occurred.");
        }
    }
}
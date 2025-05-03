import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        // create a file called faisal.txt
        try {
            File file = new File("faisal.txt");
            if (!file.exists()) {
                
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            System.err.println("An error occurred.");
        }
        // get directory path
        String directoryPath = System.getProperty("user.dir");
        System.out.println("Directory path: " + directoryPath);
    }
    

}
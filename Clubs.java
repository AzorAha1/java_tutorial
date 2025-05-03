import java.util.ArrayList;

public class Clubs {
    public static void main(String[] args) {
        ArrayList<Footballers> footballersList = new ArrayList<>();
        footballersList.add(new Footballers("Cristiano Ronaldo", "Forward", 36));
        footballersList.add(new Footballers("Lionel Messi", "Forward", 34));
        footballersList.add(new Footballers("Neymar Jr", "Forward", 29));

        System.out.println("Footballers in the ArrayList:");

        for (Footballers footballer : footballersList) {
            System.out.println("Name: " + footballer.getName());
            System.out.println("Position: " + footballer.getPosition());
            System.out.println("Age: " + footballer.getAge());
            System.out.println();
        }
        for (Footballers footballer : footballersList) {
            if (footballer.getName().equals("Cristiano Ronaldo")) {
                footballer.setAge(37);
            }
        }
        System.out.println("Footballers in the ArrayList after updating age:");
        for (Footballers footballer : footballersList) {
            System.out.println("Name: " + footballer.getName());
            System.out.println("Position: " + footballer.getPosition());
            System.out.println("Age: " + footballer.getAge());
            System.out.println();
        }
    }
}

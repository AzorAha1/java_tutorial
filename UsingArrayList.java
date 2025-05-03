import java.util.ArrayList;
public class UsingArrayList {
    public static void main(String[] args) {
        // Create an ArrayList to store Football Clubs
        ArrayList<String> FootballClubs = new ArrayList<>();
        // Add Football Clubs to the ArrayList
        FootballClubs.add("Manchester United");
        FootballClubs.add("Liverpool");
        FootballClubs.add("Chelsea");
        FootballClubs.add("Arsenal");
        FootballClubs.add("Manchester City");
        FootballClubs.add(0, "Realmadrid");
        FootballClubs.set(2, "Barcelona");
        // Print the size of the ArrayList 
        System.out.println("Size of Football Clubs ArrayList: " + FootballClubs.size());

        // Print the Football Clubs in the ArrayList
        System.out.println("Football Clubs in the ArrayList:");
        for (String club : FootballClubs) {
            System.out.println(club);
        }

        // index chelsea is on 
        int indexofChelsea = FootballClubs.indexOf("Chelsea");
        // Print the index of Chelsea
        System.out.println("Index of Chelsea: " + indexofChelsea);

        // remove a Football Club from the ArrayList
        FootballClubs.remove("Arsenal");

        // Print the Football Clubs in the ArrayList after removal
        System.out.println("Football Clubs in the ArrayList after removal:");
        for (String club : FootballClubs) {
            System.out.println(club);
        }
        // check if the ArrayList is empty
        if (FootballClubs.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
        // clear the ArrayList
        FootballClubs.clear();
        // Print the size of the ArrayList after clearing
        System.out.println("Size of Football Clubs ArrayList after clearing: " + FootballClubs.size());
        // check if the ArrayList is empty after clearing
        if (FootballClubs.isEmpty()) {
            System.out.println("The ArrayList is empty after clearing.");
        } else {
            System.out.println("The ArrayList is not empty after clearing.");
        }
        // Create an ArrayList to store House objects
        ArrayList<Houses> housesList = new ArrayList<>();
        // Add House objects to the ArrayList
        housesList.add(new Houses("Stark", "Winter is Coming", "The North", "A Wolf", "Eddard Stark"));
        for (Houses house : housesList) {
            house.printDetails();
        }
    }
}
public class foreachloop {
    public static void main(String[] args) {
        // for (data_type item : collections)
        // for earch is is a special type of for loop designed to traverse through an array objects and collections
        // collection - a collection or array that you have to loop through
        // item -  a single item from the collections

        String footballteams[] = {"realmadrid", "arsenal", "man utd"};
        for (String footballteam: footballteams) {
            System.out.println(footballteam);
        }
    }
}

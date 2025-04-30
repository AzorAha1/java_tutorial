
public class callingclasses {
    public static void main(String[] args) {
        Houses stark = new Houses("Stark", "Winter is Coming", "The North", "A Wolf", "Eddard Stark\n\n");
        Houses lannister = new Houses("Lannister", "Hear Me Roar", "The Westerlands", "A Lion", "Tywin Lannister\n\n");
        Houses targaryen = new Houses("Targaryen", "Fire and Blood", "Essos", "A Dragon", "Aegon Targaryen\n\n");
        Houses baratheon = new Houses("Baratheon", "Ours is the Fury", "Storm's End", "A Stag", "Robert Baratheon\n\n");
        Houses greyjoy = new Houses("Greyjoy", "We Do Not Sow", "The Iron Islands", "A Kraken", "Balon Greyjoy\n\n");
        Houses martell = new Houses("Martell", "Unbowed, Unbent, Unbroken", "Dorne", "A Sun Piercer", "Doran Martell\n\n");
        Houses tyrell = new Houses("Tyrell", "Growing Strong", "The Reach", "A Rose", "Mace Tyrell\n\n");
        Houses arryn = new Houses("Arryn", "As High as Honor", "The Vale", "A Falcon", "Jon Arryn\n\n");
        Houses targaryen2 = new Houses("Targaryen", "Fire and Blood", "Essos", "A Dragon", "Aegon Targaryen");

        stark.printDetails();
        lannister.printDetails();
        targaryen.printDetails();
        baratheon.printDetails();
        greyjoy.printDetails();
        martell.printDetails();
        tyrell.printDetails();
        arryn.printDetails();
        targaryen2.printDetails(); 
    }

}
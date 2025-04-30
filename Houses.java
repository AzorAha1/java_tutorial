public class Houses {
    public String houseName;
    String motto;
    String region;
    String Sigil;
    String ruler;

    //constructor
    public Houses(String houseName, String motto, String region, String Sigil, String ruler) {
        //first constructor
        this.Sigil = Sigil;
        this.houseName = houseName;
        this.motto = motto;
        this.region = region;
        this.ruler = ruler;
    }
    // method to print the details of the house
    public void printDetails() {
        System.out.println("House Name: " + houseName);
        System.out.println("Motto: " + motto);
        System.out.println("Region: " + region);
        System.out.println("Sigil: " + Sigil);
        System.out.println("Ruler: " + ruler);
    }
    
}

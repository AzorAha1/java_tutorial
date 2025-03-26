public class stringmethods {
    public static void main(String[] args) {
        String name = "Faisal";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf("a"));
        System.out.println(name.indexOf("s"));
        System.out.println(name.indexOf("l"));
        char letter = name.charAt(0);
        System.out.println(letter);
        System.out.println(name.contains("Fai"));
        System.out.println(name.contains("fai"));
        System.out.println(name.contains("s"));
        System.out.println(name.contains("z"));
        System.out.println(name.substring(0, 3));
        System.out.println(name.substring(3));
        System.out.println(name.substring(3, 5));
        int lastindex = name.lastIndexOf("a");
        System.out.println(lastindex);
    }
}

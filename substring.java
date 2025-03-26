public class substring {
    public static void main(String[] args) {
        String name = "Faisal";
        System.out.println(name.substring(0, 3));
        System.out.println(name.substring(3));
        System.out.println(name.substring(3, 5));
        int lastindex = name.lastIndexOf("a");
        System.out.println(lastindex);

        //email slicing
        String email = "wizfaiz@icloud.com";
        System.out.println(email.substring(0, 7));
        System.out.println(email.substring(8, 14));
        System.out.println(email.substring(15, 18));
        String domain = email.substring(15, 18);
        System.out.printf("The domain is: %s\n", domain);
        String subdomain = email.substring(8, 14);
        System.out.printf("The subdomain is: %s\n", subdomain);
    }
}

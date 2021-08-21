package Examples;

public class StringMethodDemo {
    public static void main(String[] args) {
        String string = "I am a good tester.  I am a good person";
        String string2 = string.replace("a","A");
        string2 =string.replaceFirst("a","A");
        string2 =string.replaceFirst("good","crappy");


        string = "gdgfddfdfFHJGJHJ447587869&^%&^%*&(*";
        string2 = string.replaceAll("[a-zA-Z0-9]","");
        string2 = string.replaceAll("[!a-zA-Z5-9]","");



        System.out.println("Old String = " + string);
        System.out.println("New String = " + string2);
    }
}

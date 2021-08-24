package Examples;

public class StringMethodDemo {
    public static void main(String[] args) {
        String string = "I am a good tester.  I am a good person";
        //String string2 = string.replace("a","A");
        String string2 = string.replace("a","A");
        string2 =string.replaceFirst("a","A");
        string2 =string.replaceFirst("good","crappy");


        string = "gdgfddfdfFHJGJHJ447587869&^%&^%*&(*";
        string2 = string.replaceAll("[a-zA-Z0-9]","");
        string2 = string.replaceAll("[!a-zA-Z5-9]","");





        System.out.println("Old String = " + string);
        System.out.println("New String = " + string2);

        string = "This is Batch 10. Batch 10 is great";
        String[] stringArray = string.split(" ");
        //stringArray = string.split("[.]");
      //  stringArray = string.split("[is]");

        for (String item : stringArray)
            System.out.println(item);
        System.out.println(stringArray.length);
        System.out.println(stringArray[7]);
        boolean haveGreat = string.contains("great");
        System.out.println(haveGreat);

        string = "gdgfddfdfFHJGJHJ4    47587869&^%&^%*&(*";
        String string1 = string.replaceAll("[a-zA-Z0-9]","");
        string2 = string.replaceAll("[^a-z A-Z0-9]","");
        String string3 = string.replaceAll("[!a-zA-Z0-9]","");


        System.out.println("Old String = " + string);
        System.out.println("String1 = " + string1);
        System.out.println("String2 = " + string2);
        System.out.println("String3 = " + string3);
        //joe was here!!!!!!





    }
}

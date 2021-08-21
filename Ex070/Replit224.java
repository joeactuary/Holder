package Ex070;


class Replit224 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(removeConsecutiveDuplicates("aabbcde"));
        System.out.println(removeConsecutiveDuplicates("aabbcc"));
        System.out.println(removeConsecutiveDuplicates("aabbcca"));
        System.out.println(removeConsecutiveDuplicates("aabbccaddda"));


    }

    public static String removeConsecutiveDuplicates(String str) {
        String buildString = str.substring(0,1);

        char testChar =' ';
        char compareChar =' ';


        for (int i = 1; i < str.length(); i++) {
            testChar = str.charAt(i);
            compareChar =str.charAt(i-1);
            if (testChar != compareChar)
                buildString += testChar;

        }
return buildString;

    }
}


/*
class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static String removeConsecutiveDuplicates(String input) {

    }
}*/

package Ex070;

import java.util.ArrayList;


class Replit221 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(findMaxLenEven("find MaxLen Even"));
        System.out.println(findMaxLenEven("I am very Good at Java"));
        System.out.println(findMaxLenEven("I was"));


    }

    public static String findMaxLenEven(String str) {
        String buildString = "";
        String maxEvenString = "";
        char testChar =' ';


        for (int i = 0; i < str.length(); i++) {
            testChar = str.charAt(i);
            if (testChar != ' ')
                buildString += testChar;
            else if (buildString.length() % 2 == 0 && buildString.length() > maxEvenString.length()) {
                maxEvenString = buildString;
                buildString = "";
            }
            else                    buildString = "";
                }

if (maxEvenString.equals("")) return "-1";
        return maxEvenString;

    }
}

package Ex070;

import java.util.ArrayList;


class Replit220 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(formatString("00-44 48 555555"));
        System.out.println(formatString("00-44 48 555"));
        System.out.println(formatString("00-44 #$% 48 55"));


    }
    public static String formatString(String S){
    String buildString="";
    int buildCount = 0;
    char testChar = ' ';

    for (int i = 0; i< S.length(); i++) {
        testChar = S.charAt(i);
        if (Character.isDigit(testChar)) {
            buildString += testChar;
            buildCount++;
            buildString = (buildCount%3==0) ? buildString += "-" : buildString;

        }
               }
        testChar = buildString.charAt(buildString.length()-1);
    if (testChar == '-') {
        buildString=buildString.substring(0,buildString.length()-1);

    }
            return buildString;
    }
}
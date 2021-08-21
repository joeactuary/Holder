package July20;

import java.util.Scanner;

public class Main21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is it sunny outside?");
        boolean isSunny = scanner.nextBoolean();

        DayCheck.sunCheck(isSunny);
        if (isSunny) {
            System.out.println("What is the temperature outside?");
            int temperature = scanner.nextInt();
            TempCheck.tempCheck(temperature);
        }
    }
}

class DayCheck {
    public static void sunCheck (boolean isSunny) {
        System.out.println((isSunny == true ) ? "It is a sunny day, I should go somewhere!" : "I stay home and practice Java" );
    }
}

class TempCheck {
    public static void tempCheck (int temperature) {
        System.out.println((temperature > 85 ) ? "I am going to the beach" : "I am going to the park" );
    }
}


class PrintMonth {
    public static void printMonth (int month) {
        String[] monthList = {"January", "February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println((month >=0 && month <= monthList.length) ? monthList[month] : "Invalid");
    }
}



/*
class Hw23{
    public static String getResult(int input){
        return (input >= 18) ? "You are eligible to vote" : "You are not eligible to vote";
    }
    }
 */


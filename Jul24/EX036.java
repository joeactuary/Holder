package Jul24;

import java.util.Scanner;

public class EX036 {

    public static String drinkDecision(boolean thirsty, boolean sleepy){

        if (thirsty && sleepy)   return "coffee";
        if (thirsty && !sleepy)   return "water";
        if (!thirsty && sleepy)   return "tea";
        return "nothing";
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you thirsty");
        boolean thirsty = scanner.nextBoolean();
        System.out.println("Are you sleepy");
        boolean sleepy = scanner.nextBoolean();

        System.out.println("Looks like you need to drink " + drinkDecision(thirsty,sleepy) );
    }
}

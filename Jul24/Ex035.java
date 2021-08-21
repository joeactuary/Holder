package Jul24;

import java.util.Scanner;

public class Ex035 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Do you need a loan? Y/N");
        boolean needLoan = scanner.nextBoolean();
        if (needLoan == true) {
            int creditScore = scanner.nextInt();
            System.out.println("The eligibility is " + loanDecision(creditScore));
        }
        else System.out.println("Unknown");


    }

    public static String loanDecision(int creditScore) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("What is your credit score?");

        if (creditScore < 600)
            return "Not eligible";
        else if (creditScore <= 700)
            return "Maybe eligible";
        else if (creditScore <= 800)
            return "Eligible";
        else
            return "Definitely eligible";
    }



}
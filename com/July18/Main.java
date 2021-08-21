package com.July18;
import java.util.Scanner;

class Diploma {
    public static String Diploma(boolean diploma, double gpa) {
        if (diploma)
            return (gpa >= 3.5) ? "Congratulations! You are eligible for scholarship." : "Congratulations! You should have studied harder.";
        else return "You should get a degree.";
    }
}
class Mortgage {
    private double mortgageRate;
    private double mortgagePrice2;

    public Mortgage(double mortgageRate, double moertgagePrice) {
        this.mortgageRate = mortgageRate;
        this.mortgagePrice2 = mortgagePrice2;
    }

    public String HouseDecision(){
        if (mortgageRate > 4.5) return "user will not buy house";
        return (mortgagePrice2 > 200000) ? "user will take mortgage" : "user will pay cash";
    }
}

class Donor {
    private int age, weight;
    private String result;

    public Donor(int age, int weight) {
        this.age = age;
        this.weight = weight;
        if (age<18) this.result = "Sorry, not eligible due to age";
        else this.result = (weight>110) ? "Yes, you can donate blood" : "Sorry, you don't weigh enough";
    }

    public String getResult() {
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your GPA (Enter zero if no GPA:");
        double gpa = scanner.nextDouble();
        System.out.println(Diploma.Diploma(true, gpa));
        Mortgage mortgage = new Mortgage(2.1,650000);
        System.out.println(mortgage.HouseDecision());
        Donor donor = new Donor(34,100);
        System.out.println(donor.getResult());
    }
}
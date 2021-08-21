package July18b;

import java.util.Scanner;

class
Loan {
    private double amount;
    private String loanDecision;

    public Loan(double amount) {
        this.amount = amount;
        loanDecision = (amount <= 200000) ? "Yes, we will loan you this amount" : "No, cannot make this loan.";
    }

    public String getLoanDecision() {
        return loanDecision;
    }
}

class DMV {
    public static void DMV(int age) {
        System.out.println((age >= 18) ? "Yes, we will issue you a driver's License" : "Sorry please get a Driver's Permit first");
    }
}

class Temperature {
    private String city;
    private double celcius;
    private double fahrenheit;

    public Temperature(String city, double fahrenheit) {
        this.city = city;
        this.fahrenheit = fahrenheit;
        this.celcius =  (double) Math.round((fahrenheit -32) *5/9*100)/100;
        System.out.println("The temperature in the city "+ this.city+ " " + this.celcius + " celcius degrees.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scannerSt = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in desired loan amount");
        double loanRequested = scanner.nextDouble();
        Loan loan = new Loan(loanRequested);
        System.out.println(loan.getLoanDecision());
        System.out.println("Please type in your age");
        int age = scanner.nextInt();
        DMV.DMV(age);
        System.out.println("Please type in your city");
        String city = scannerSt.nextLine();
             System.out.println("Please type in temperature in Fahrenheit");
        double fahr = scanner.nextDouble();
        Temperature city1 = new Temperature(city,fahr);
    }
}

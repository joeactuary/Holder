package com.July18;
import java.util.Scanner;

public class Main3 {
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
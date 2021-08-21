package July20;

import java.util.Scanner;

class NumberCheck {
    private int number;
    private String evenOrOdd;
    private String largeOrRight;

    public NumberCheck(int number) {
        this.number = number;
        this.evenOrOdd = ((number % 2) == 0) ? "even" : "odd";
        this.largeOrRight = (this.evenOrOdd.equals("even") && number > 1000) ? "large" : "just right";
            }

    public String evenOrOdd() {
        return evenOrOdd;
    }

    public String largeOrRight() {
        return largeOrRight;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();
        NumberCheck number1 = new NumberCheck(number);
        System.out.println("Value is " + number1.evenOrOdd());
        System.out.println(number1.evenOrOdd().substring(0, 1).toUpperCase() + number1.evenOrOdd().substring(1) + " value is "+ number1.largeOrRight());

        // str.substring(0, 1).toUpperCase() + str.substring(1)
    }
}

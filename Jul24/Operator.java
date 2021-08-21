package Jul24;
import java.util.Scanner;

public class Operator {

    static void printOperation(double num1, double num2, char operator, double result) {
        String num1Print = String.format("%.2f", num1);        String num2Print = String.format("%.2f", num2);
        String resultPrint = String.format("%.2f", result);
        System.out.println(num1Print + " " + operator + " " + num2Print + " = " + resultPrint);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        double num1 = scanner.nextDouble();
        System.out.println("Please enter second number");
        double num2 = scanner.nextDouble();
        System.out.println("Please enter operator(+,-,*,/)");
        char operator = scanner.next().charAt(0);
        double result = 0;

        switch (operator) {
            case '+':
                printOperation(num1, num2, operator, num1+num2);
                break;
            case '-':
                printOperation(num1, num2, operator, num1-num2);
                break;
            case '*':
                printOperation(num1, num2, operator, num1*num2);
                break;
            case '/':
                printOperation(num1, num2, operator, num1/num2);
                break;
            default:
                System.out.println(operator + " is not a valid operator");
        }
    }
}

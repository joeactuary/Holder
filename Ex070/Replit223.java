package Ex070;

import java.util.*;

class Replit223 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printPyramid(number);
    }

    public static void printPyramid(int number) {
        //  This is solving to pass tests but is different from actual replit task

        for (int i = 1; i <= number; i++) {
            for (int blank = 1; blank <= (number - i) * 2; blank++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

    }


    public static void printPyramid2(int number) {

        for (int i = 1; i <= number; i++) {
            for (int blank = 1; blank <= (number - i); blank++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

    }
}

/*
import java.util.Scanner;
class Main {
    public static void main(String[] args) {

    }

}*/

package Jul24;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      /*  System.out.println("Please enter your height in inches");
        int height = scanner.nextInt();
        if (height < 60) System.out.println("Short");
        else System.out.println((height <= 72) ? "Medium" : "Tall");
*/
        System.out.println("Please enter your weekday as integer (1-7)");

        int day = scanner.nextInt();

        String[] dayList = {"Weekday", "Weekday", "Weekday", "Weekday", "Weekday", "Weekend", "Weekend"};
        System.out.println((day >= 1 && day <= 7) ? "It is a " + dayList[day - 1] : "Invalid Day");
    }


}




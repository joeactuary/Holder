package July20;
import java.util.Scanner;

class MainArray {

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(3);
        System.out.println("The largest number is " + getMax(myIntegers));
    }

    public static int[] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter " + number + " distinct numbers");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++)
            values[i] = scanner.nextInt();
        return values;
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++)
            max = (array[i] > max) ? array[i] : max;
        return max;
    }

}



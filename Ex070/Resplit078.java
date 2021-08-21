package Ex070;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Resplit078 {
    public static void main(String[] args) {
        ArrayList<Integer> joeList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        for (int i=1; i<= 5; i++)  {
            joeList.add(scanner.nextInt());
        }

        ListIterator<Integer> iterator = joeList.listIterator();

        while (iterator.hasNext()) {
            System.out.println(10 * iterator.next());
        }
    }
}

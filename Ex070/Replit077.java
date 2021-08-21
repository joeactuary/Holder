package Ex070;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Replit077 {
    public static void main(String[] args) {
        ArrayList<Integer> joeList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        for (int i=1; i<= 5; i++)  {
            joeList.add(scanner.nextInt());
        }

        ListIterator iterator = joeList.listIterator(joeList.size());

      //  while (iterator.hasNext()) {
     //      iterator.next();

      //              }
        //haha  iterator only works in one direction!!!   Will need to start using listiterator!!!!
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
    }
}

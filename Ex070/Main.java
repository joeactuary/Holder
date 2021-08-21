package Ex070;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> joesIntegers = new ArrayList<Integer>();
        joesIntegers.add(45);
        joesIntegers.add(78);
        joesIntegers.add(12);
        joesIntegers.add(67);
        joesIntegers.add(55);
        joesIntegers.add(89);
        joesIntegers.add(23);
        joesIntegers.add(77);
        joesIntegers.add(88);

      /* int i= 0;
        for (int x: joesIntegers) {
            if (i%2 == 0) System.out.print(x + " ");
            i++;
        }
        System.out.println("");*/


        Iterator<Integer> iterator = joesIntegers.iterator();

        int i = 0;
        while (iterator.hasNext()) {
           if (i%2==0) System.out.print(iterator.next() + " ");
           else iterator.next();
           i++;
        }


    }
}

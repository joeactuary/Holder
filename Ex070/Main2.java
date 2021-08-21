package Ex070;

import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) {
        ArrayList <Character> joesCharacters = new ArrayList<Character>();
        joesCharacters.add('s');
        joesCharacters.add('a');
        joesCharacters.add('y');
        joesCharacters.add('b');
        joesCharacters.add('n');
        joesCharacters.add('c');
        joesCharacters.add('t');
        joesCharacters.add('d');
        joesCharacters.add('a');
        joesCharacters.add('e');
        joesCharacters.add('x');

      /* int i= 0;
        for (int x: joesIntegers) {
            if (i%2 == 0) System.out.print(x + " ");
            i++;
        }
        System.out.println("");*/


        Iterator<Character> iterator = joesCharacters.iterator();

        int i = 0;
        while (iterator.hasNext()) {
            if (i%2==0) System.out.print(iterator.next());
            else iterator.next();
            i++;
        }


    }
}

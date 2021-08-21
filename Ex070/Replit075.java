package Ex070;

import java.util.ArrayList;
import java.util.Iterator;

public class Replit075 {
    public static void main(String[] args) {
        ArrayList<Integer> joeList = new ArrayList<Integer>();
        joeList.add(45);
        joeList.add(78);
        joeList.add(12);
        joeList.add(67);
        joeList.add(55);
        joeList.add(89);
        joeList.add(23);
        joeList.add(77);
        joeList.add(88);

        Iterator<Integer> iterator = joeList.iterator();

        int i = 0;
        while (iterator.hasNext()) {
            if ((i - 1) % 3 == 0) System.out.print(iterator.next() + " ");
            else iterator.next();
            i++;
        }
    }
}

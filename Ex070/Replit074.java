package Ex070;

import java.util.ArrayList;
import java.util.Iterator;

public class Replit074 {
    public static void main(String[] args) {
        ArrayList<Integer> joeList = new ArrayList<Integer>();

        for (int i = 2010; i<=2020; i++) {
            joeList.add(i);
        }

        Iterator<Integer> iterator = joeList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

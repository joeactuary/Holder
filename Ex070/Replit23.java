package Ex070;

import java.util.ArrayList;
import java.util.Iterator;

public class Replit23 {
    public static void main(String[] args) {
        ArrayList<String> joeList = new ArrayList<String>();
        joeList.add("This");
        joeList.add("is");
        joeList.add("array");
        joeList.add("of");
        joeList.add("strings");

        Iterator<String> iterator = joeList.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}

package Ex070;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Replit076 {
    public static void main(String[] args) {
        ArrayList<String> joeList = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<= 6; i++)  {
            System.out.println("Please enter day " + (i+1) + " of the week");
            joeList.add(scanner.nextLine());

        }

        Iterator<String> iterator = joeList.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
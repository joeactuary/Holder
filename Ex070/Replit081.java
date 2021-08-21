package Ex070;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class MyList {
    private ArrayList<Integer> myList;
    private int maxItem;

    public MyList(Integer[] array) {
        this.myList = new ArrayList<Integer>();
        this.maxItem = Integer.MIN_VALUE;
        for (int item : array) {
            this.myList.add(item);
        }
    }

    public int getMaxItem() {
        Iterator<Integer> iterator = this.myList.iterator();
        while (iterator.hasNext()) {
            maxItem = Math.max(maxItem, iterator.next());
        }
        return maxItem;
    }

    public void printMyList() {
        Iterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()) System.out.print(iterator.next() + " ");
        System.out.println("");
    }

    public void addItems(Integer[] array) {
        for (int item : array) {
            this.myList.add(item);
        }
    }
}


public class Replit081 {
    public static void main(String[] args) {
        MyList myList = new MyList(new Integer[]{5, 4, 8});
        //myList.printMyList();
        //myList.addItems(new Integer[]{545, 81, 6});
       // myList.printMyList();
        System.out.println(myList.getMaxItem());
    }
}









package Replit082;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

class MyList {
    private ArrayList<ArrayList<Integer>> myList = new ArrayList<ArrayList<Integer>>();
    private int[] sumArray;

    public MyList(Integer[] array) {
        this.myList.add(new ArrayList<Integer>());
        for (Integer item : array) {
            this.myList.get(0).add(item);
        }
    }

    public ArrayList<ArrayList<Integer>> getMyList() {
        return myList;
    }

    public int[] getSumArray() {

        Iterator<ArrayList<Integer>> iterator2 = this.myList.iterator();
        int[] sumArray = new int[this.myList.size()];
        int x = 0;
        while (iterator2.hasNext()) {
            Iterator<Integer> iterator = iterator2.next().iterator();
            int joeSum = 0;
            while (iterator.hasNext()) joeSum += iterator.next();
            sumArray[x] = joeSum;
            x++;
        }

        return sumArray;
    }

    public void printMyList() {
        Iterator<ArrayList<Integer>> iterator2 = this.myList.iterator();
        while (iterator2.hasNext()) {
            Iterator<Integer> iterator = iterator2.next().iterator();
            while (iterator.hasNext()) System.out.print(iterator.next() + " ");
            System.out.println("");
        }
    }

    public int sumMyList() {
        int joeSum = 0;
        Iterator<ArrayList<Integer>> iterator2 = this.myList.iterator();
        while (iterator2.hasNext()) {
            Iterator<Integer> iterator = iterator2.next().iterator();
            while (iterator.hasNext()) joeSum += iterator.next();
        }
        return joeSum;
    }

    public int negativeAndOdd() {
        int joeSum = 0;
        int temp = 0;
        Iterator<ArrayList<Integer>> iterator2 = this.myList.iterator();
        while (iterator2.hasNext()) {
            Iterator<Integer> iterator = iterator2.next().iterator();
            while (iterator.hasNext()) {
                temp = iterator.next();
                joeSum = (temp < 0 && temp % 2 != 0) ? joeSum += 1 : joeSum;
            }
        }
        return joeSum;
    }

    public int SumEvens() {
        int joeSum = 0;

        ListIterator<ArrayList<Integer>> iterator2 = this.myList.listIterator();
        while (iterator2.hasNext()) {

            if (iterator2.nextIndex() % 2 == 0) {
                ListIterator<Integer> iterator = iterator2.next().listIterator();
                while (iterator.hasNext()) {
                    int item = iterator.next();
                    //int counter =iterator.nextIndex();
                    joeSum = (iterator.previousIndex() % 2 == 0) ? joeSum += item : joeSum;
                }

            } else {
                iterator2.next();

            }
        }
        return joeSum;
    }

    public void addRow(Integer[] array) {
        this.myList.add(new ArrayList<Integer>());
        int newRowNo = this.myList.size() - 1;
        for (Integer item : array) {
            this.myList.get(newRowNo).add(item);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList(new Integer[]{-5, -2, -3, 7});
        myList.addRow(new Integer[]{1, -5, -2, 2});
        myList.addRow(new Integer[]{1, -2, 3, -4});


        myList.printMyList();
        System.out.println("The sum of all the elements is " + myList.sumMyList());
        System.out.println("The count of all the negative odd elements is " + myList.negativeAndOdd());

        printArrayVertical(myList.getSumArray());

        System.out.println("Sum of Evens is " + myList.SumEvens());

    }

    public static void printArrayVertical(int[] array) {
        for (int x : array) {
            System.out.println(x);
        }
    }

}


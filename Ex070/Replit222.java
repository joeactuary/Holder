package Ex070;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


class Replit222 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(findMaxSum(new ArrayList<>(Arrays.asList(10, 20, 30, 40))));
     //   System.out.println(findMaxSum(new ArrayList<>(Arrays.asList(5, 3, 8, 9, 10, 11, 5))));
    }

    public static int findMaxSum(List<Integer> list) {
        int maxItem = Integer.MIN_VALUE;
        int secondMaxItem = Integer.MIN_VALUE;

        // Iterator<Integer> iterator = list.iterator();
        //  while (iterator.hasNext()) {
        //      maxItem = Math.max(maxItem, iterator.next());

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
            if(temp>maxItem) {
                secondMaxItem = maxItem;
                maxItem = temp;
            }else if(temp>secondMaxItem) {
                secondMaxItem=temp;
            }


        }

        return maxItem + secondMaxItem;
    }
}

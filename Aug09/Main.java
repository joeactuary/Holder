package Aug09;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> carList;
        carList = new ArrayList<>();
        carList.add("porche");
        carList.add("tesla");
        carList.add("mustang");
        carList.add("jeep");

        String[] cars = {"porche", "tesla", "mustang", "jeep"};
        for (String car : carList) {
            System.out.println(car);
        }
        for (String joeCar : cars) {
            System.out.println(joeCar);
        }



       /* Iterator<String> iterator = carList.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());*/


        for (String s : carList) System.out.println(s);



            }


    }



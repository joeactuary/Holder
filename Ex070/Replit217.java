package Ex070;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Replit217 {
    public static void main(String[] args) {

        System.out.println(countDuplicates(new ArrayList<>(Arrays.asList(12,12,13,45,78,7,7))));
        System.out.println(countDuplicates(new ArrayList<>(Arrays.asList(12,12,7,7,7,7,7))));
        System.out.println(countDuplicates(new ArrayList<>(Arrays.asList(12,120,13,45,78,17,57))));
        System.out.println(countDuplicates(new ArrayList<>(Arrays.asList(12,12,13,45,78,67,87))));

    }

    public static int countDuplicates(List<Integer> numbers) {
        int duplicates = 0;
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) != null && numbers.get(i) == numbers.get(j)) {
                    for (int k = j; k < numbers.size(); k++) {
                        if (numbers.get(k) == numbers.get(i)) numbers.set(k, null);
                    }
                    duplicates++;
                    break;

                }



            }
        }

        return duplicates;
    }
}



/*import java.util.ArrayList;
        import java.util.List;

class Main {

    public static void main(String[] args ){
        System.out.println("Hello World");
    }
    static int countDuplicates(List<Integer> numbers){
        return 0;
    }
}*/

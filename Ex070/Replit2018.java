package Ex070;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Replit2018 {
    public static void main(String[] args) {

        System.out.println(countDuplicates(Arrays.asList("switch","tv","switch","tv","switch","tv","radio")));
        System.out.println(countDuplicates(new ArrayList<>(Arrays.asList("switch","tv","switch","tv"))));
        System.out.println(countDuplicates(new ArrayList<>(Arrays.asList("switch","tv"))));
            }

    public static List<String> countDuplicates(List<String> deviceNames) {
        int duplicates = 0;
        for (int i = 0; i < deviceNames.size(); i++) {
            int temp=1;
            for (int j = i + 1; j < deviceNames.size(); j++) {

                if (deviceNames.get(i) != null && deviceNames.get(i) == deviceNames.get(j)) {
                    deviceNames.set(j,deviceNames.get(i)+temp);
                    temp++;

                }



            }
        }

        return deviceNames;
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

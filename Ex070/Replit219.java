package Ex070;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Replit219 {
    public static void main(String[] args) {

        System.out.println(countOnlyPrefixes(Arrays.asList("steve","stevens","danny","steves","dan","john","johny" ,"joe" ,"alex" ,"alexander"),Arrays.asList("steve","alex","joe","john","dan")));
            }


    public static List<Integer> countOnlyPrefixes(List<String> names,List<String> query){
        ArrayList dupsList = new ArrayList<String>();

        String tempQuery ="";
        String tempName="";
        String tempName2 = "";
        Iterator<String>  iteratorQuery = query.iterator();
        while (iteratorQuery.hasNext()){
            tempQuery = iteratorQuery.next();

            int duplicates = 0;
            Iterator<String> iteratorNames =names.iterator();

                while (iteratorNames.hasNext()) {
                    tempName = iteratorNames.next();
                    int ql = tempQuery.length();
                    int nl = tempName.length();
                   tempName2 = (tempName.length() > tempQuery.length())   ? tempName.substring(0, tempQuery.length()) : "";

                    if (tempQuery.equals(tempName2)) {
                        duplicates++;

                    }
                }
            dupsList.add(duplicates);

            }


        return dupsList;
    }
}


/*import java.util.ArrayList;
        import java.util.List;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static List<Integer> countOnlyPrefixes(List<String> names,List<String> query){


    }
}*/

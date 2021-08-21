package Jul24;


import java.util.ArrayList;
import java.util.Scanner;

class ChildAge {
    private int age;
    private String scenario;

    public ChildAge(int age, String scenario) {
        this.age = age;
        this.scenario = scenario;
    }

    public int getAge() {
        return age;
    }

    public String getScenario() {
        return scenario;
    }
}

class ChildChart {
    private ArrayList<ChildAge> childChart;

    public ChildChart() {
        this.childChart = new ArrayList<ChildAge>();
        childChart.add(new ChildAge(1,"You can Crawl"));
        childChart.add(new ChildAge(2,"You can Talk"));
        childChart.add(new ChildAge(3,"You can Dance"));
        childChart.add(new ChildAge(4,"You can get Trouble"));
            }

            public ChildAge findChildAge(int age){
        for (int i=0; i < childChart.size(); i++) {
            if (childChart.get(i).getAge() == age)
                return childChart.get(i);
        }
            return null;
        }

    public String queryScenario(int age){
        return findChildAge(age).getScenario();
    }


}


public class Ex041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age of the Child");
        int age = scanner.nextInt();

        ChildChart childChart = new ChildChart();
        //if (childChart.findChildAge(age) == null)
        //    System.out.println("I don't know how old you are");
        //else System.out.println(childChart.queryScenario(age));
            System.out.println((childChart.findChildAge(age) == null) ? "I don't know how old you are" : childChart.queryScenario(age) );
    }
}

package Jul30;


import java.util.ArrayList;
import java.util.Scanner;

class RollNumber {
    private int joeNo;
    private String name;

    public RollNumber(int no, String name) {
        this.joeNo = no;
        this.name = name;
    }

    public int getJoeno() {
        return joeNo;
    }

    public String getName() {
        return name;
    }
}

class Students {
    private ArrayList<RollNumber> students;

    public Students() {
        this.students = new ArrayList<RollNumber>();
        students.add(new RollNumber(101,"Ramesh"));
        students.add(new RollNumber(102,"Mahesh"));
        students.add(new RollNumber(103,"Mukesh"));
                    }

            public RollNumber findRollNo(int joeNo){
        for (int i=0; i < students.size(); i++) {
            if (students.get(i).getJoeno() == joeNo)
                return students.get(i);
        }
            return null;
        }

    public String queryScenario(int joeNo){
        return findRollNo(joeNo).getName();
    }


}


public class Ex041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the roll number of the Child");
        int joeNo = scanner.nextInt();

        Students students = new Students();
        //if (childChart.findChildAge(age) == null)
        //    System.out.println("I don't know how old you are");
        //else System.out.println(childChart.queryScenario(age));
            System.out.println((students.findRollNo(joeNo) == null) ? "Not found Student name: in Class" : "Student name: " + students.queryScenario(joeNo) );
    }
}

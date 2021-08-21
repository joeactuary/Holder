package Jul24;


import java.util.ArrayList;
import java.util.Scanner;

class Instructor {
    private String name;
    private String assignnment;

    public Instructor(String name, String assignnment) {
        this.name = name;
        this.assignnment = assignnment;
    }

    public String getName() {
        return name;
    }

    public String getAssignnment() {
        return assignnment;
    }
}

class Schedule {
    private ArrayList<Instructor> schedule;

    public Schedule() {
        this.schedule = new ArrayList<Instructor>();
        this.schedule.add(new Instructor("Asghar", "Java"));
        this.schedule.add(new Instructor("Moazzam", "SDLC"));
        this.schedule.add(new Instructor("Weqas", "Selenium"));
        this.schedule.add(new Instructor("Asel", "every"));
    }

    public Instructor findInstructor(String instructor) {
        for (int i = 0; i < this.schedule.size(); i++) {
            if (this.schedule.get(i).getName().equals(instructor))
                return this.schedule.get(i);
        }
        return null;
    }

    public String queryAssignment(String name) {
        return findInstructor(name).getAssignnment();
    }
}

public class Ex040 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of the Instructor");
        String instructorName = scanner.nextLine();
        Schedule schedule = new Schedule();
        if (schedule.findInstructor(instructorName) == null)
            System.out.println("Invalid instructor selected");
        else System.out.println("Will take care of " + schedule.queryAssignment(instructorName) + " Assignment");
    }
}


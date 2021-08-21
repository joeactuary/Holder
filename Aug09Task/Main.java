package Aug09Task;

import java.util.ArrayList;
import java.util.LinkedList;

class  Person {
  private String salutation;
  private String name;

    public Person(String salutation, String name) {
        this.salutation = salutation;
        this.name = name;
    }

    public String getSalutation() {
        return salutation;
    }

    public String getName() {
        return name;
    }
}

class PersonArray {
    public ArrayList<Person> personArray;

    public PersonArray() {
        this.personArray = new ArrayList<Person>();
       this.personArray.add(new Person("Mr.","Smith"));
        this.personArray.add(new Person("Mrs.","Jordan"));
        this.personArray.add(new Person("Ms.","Jackson"));
        this.personArray.add(new Person("Miss.","Obama"));
    }

    public ArrayList<Person> getPersonArray() {
        return personArray;
    }
}

public class Main {
    public static void main(String[] args) {
        PersonArray myNames = new PersonArray();
        for (Person person : myNames.getPersonArray()) {
            System.out.println(person.getSalutation() + " " + person.getName());

        }

    }
}

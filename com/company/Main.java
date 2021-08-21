package com.company;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Joseph", "Flushing", "NY", "718-969-3343");
        student.printMessage();

        Student student1 = new Student("Rina", "Moscow", "Russia", "718-821-9251");
        student1.printMessage();

student1.setCity("Omaha");
student1.printMessage();

Operate numbers = new Operate(45.4, 18.6);
    numbers.operate();

        numbers.rectangle();
        numbers.square();
    }
}

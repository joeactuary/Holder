package com.company;

public class Operate {

    private Double num1;
    private Double num2;

    public Operate(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Double getNum1() {
        return num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void operate(){
        System.out.println("The sum of 2 numbers " + num1 + "and" + num2 + " is equal to " + (num1 + num2));
        System.out.println("The difference of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1 - num2));
        System.out.println("The product of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1 * num2));
        System.out.println("The division of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1 / num2));
    }

    public void square() {
        System.out.println("The square of " + num1 +" is "+ (num1*num1));
    }

    public void rectangle() {
        System.out.println("The perimeter of a rectangle with width " + num1 + " and " + num2 + " is " + (num1+num2+num1+num2)+ " and the area is "+ (num1*num2));
    }
}

package Ex070;

class Car {
    private String color;
    private int year;
    private String make;

    public Car(String color, int year, String make) {
        this.color = color;
        this.year = year;
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    @Override
    public String toString() {
        return "Car color is " + this.color + " and car year is " + this.year + " and car model is " + this.make;
    }
}


    class Replit086 {

    public static void main(String[] args) {

       Car car1 = new Car ("Black" , 2109, "BMW");
        Car car2 = new Car ("White" , 2108, "Toyota");
        System.out.println(car1);
        System.out.println(car2);

    }
}

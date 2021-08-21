package Jul30;

import java.util.ArrayList;
import java.util.Scanner;

class Car {
    private String carMake;
    private String Origin;

    public Car(String carMake, String origin) {
        this.carMake = carMake;
        Origin = origin;
    }

    public String getCarMake() {
        return carMake;
    }

    public String getOrigin() {
        return Origin;
    }
}

class CarList {

    private String name;
    private ArrayList<Car> carList;

    public CarList(String name) {
        this.name = name;
        this.carList = new ArrayList<Car>();

        carList.add(new Car("BMW", "german Car"));
        carList.add(new Car("Toyota", "japanese Car"));
        carList.add(new Car("Maserati", "italian Car"));
    }

    public String getName() {
        return name;
    }



    public ArrayList<Car> getCarList() {
        return carList;
    }

    public Car findCar(String carName) {
        for (Car checkedCar : this.carList) {
            if (checkedCar.getCarMake().equals(carName))
                return checkedCar;
        }
        return null;
    }

    public String queryCarOrigin(String name) {
             return findCar(name).getOrigin();
    }
}

public class EX044 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your favorite car make");
        String carMake = scanner.nextLine();
        CarList carList = new CarList("Ex044 Car List");
        String origin = (carList.findCar(carMake) == null) ? "unknown" : carList.queryCarOrigin(carMake);
        System.out.println("Your favorite car is " + origin);
    }
}

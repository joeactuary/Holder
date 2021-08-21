package July25;

import java.util.Scanner;

public class SaleValue {


    public static void salePrice() {
        double discount = 0;
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please tell me the item");
        String item = scanner2.nextLine();
        System.out.println("Please tell me the price of " + item);
        double price = scanner2.nextDouble();
        if (price < 20) discount =.1;
        else if (price < 100) discount = .2;
        else if (price < 500) discount = .3;
        else discount = .5;

        String finalPrice = String.format("%.2f", (double) Math.round(price * (1-discount) * 100)/100);
        String pricePrint = String.format("%.2f", (double) Math.round(price * 100)/100);
        //System.out.println(finalPrice2);
        System.out.println("After discount "+ discount*100 +"%" + ", the price of " + item + " is reduced from $" + pricePrint + " to $" + finalPrice);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is there a sale today? yes or no");
        String sale = scanner.nextLine();
        if (sale.equals("no"))
        System.out.println("You arte not going shopping");
        else if (sale.equals("yes"))
            SaleValue.salePrice();
else System.out.println("You did not give me a valid answer");

    }
}

package car;

import comparators.*;

import java.util.Arrays;
import java.util.Comparator;

public class CarAppl {
    public static void main(String[] args) {
        Car[] toyota = {
                new Car(2010, "Rav4", "silver", 2.8, 17987.99),
                new Car(2018, "CH-R", "white", 1.8, 20222.22),
                new Car(2021, "Corolla", "red", 1.4, 18765.99),
                new Car(2015, "Highlander", "black", 2.4, 21000.00),
                new Car(2018, "Land Cruiser", "blue", 3.2, 31245.12),
                new Car(2009, "Supra", "yellow", 3.4, 11276.09),
                new Car(2009, "Camry", "green", 2.0, 15206.00),
                new Car(2010, "Corolla", "grey", 1.4, 9213.13),
                new Car(2021, "Supra", "red", 3.4, 28176.09),
                new Car(2021, "Rav4", "white", 2.4, 30276.15)
        };

        displayCars(toyota);
        Arrays.sort(toyota);
        System.out.println("==========BY MODEL");
        displayCars(toyota);
        System.out.println("==========BY YEAR");
        Arrays.sort(toyota, new ComparatorByYear());
        displayCars(toyota);
        System.out.println("==========BY COLOUR");
        Arrays.sort(toyota, new ComparatorByColour());
        displayCars(toyota);
        System.out.println("==========BY ENGINE");
        Arrays.sort(toyota, new ComparatorByEngine());
        displayCars(toyota);
        System.out.println("==========BY PRICE");
        Arrays.sort(toyota, new ComparatorByPrice());
        displayCars(toyota);
        System.out.println("==========BY YEAR and PRICE");
        Arrays.sort(toyota, new ComparatorByYearAndPrice());
        displayCars(toyota);
    }

    private static void displayCars(Car[] toyota) {
        for (Car c : toyota) {
            System.out.println(c);

        }

    }
}

package comparators;

import java.util.Comparator;

import car.Car;

public class ComparatorByYear implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getYear() - o2.getYear();
    }
}

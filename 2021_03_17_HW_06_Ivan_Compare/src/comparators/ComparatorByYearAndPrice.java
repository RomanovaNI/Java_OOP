package comparators;

import car.Car;

import java.util.Comparator;

public class ComparatorByYearAndPrice implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        int res = o1.getYear() - o2.getYear();
        return res == 0 ? Double.compare(o1.getPrice(), o2.getPrice()) : res;
    }
}

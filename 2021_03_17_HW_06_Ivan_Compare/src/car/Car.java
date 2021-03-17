package car;

public class Car implements Comparable<Car> {
    private int year;
    private String model = "undefined";
    private String colour = "undefined";
    private double engine;
    private double price;

    public Car(int year, String model, String colour, double engine, double price) {
        setYear(year);
        if (model != null && !model.isEmpty())
            this.model = model;
        if (colour != null && !colour.isEmpty())
            this.colour = colour;
        setEngine(engine);
        setPrice(price);
    }

    public Car() {
        model = "undefined";
        colour = "undefined";
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1820)
            System.out.println("undefined");
        else
            this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isEmpty())
            this.model = model;
        else
            System.out.println("wrong model");
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        if (colour != null && !colour.isEmpty())
            this.colour = colour;
        else
            System.out.println("wrong colour");
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        if (engine > 0)
            this.engine = engine;
        else
            System.out.println("wrong engine");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
        else
            System.out.println("wrong price");
    }

    @Override
    public String toString() {
        return "car.Car{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", engine=" + engine +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return model.compareTo(o.model);
    }
}

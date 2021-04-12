package items;

public abstract class Figure {
    double length;

    public Figure() {
    }

    public Figure(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0.0)
            this.length = length;
        else
            System.out.println("Wrong length");
    }

    public abstract double calcSquare();

    public abstract double calcPerimeter();

    @Override
    public String toString() {
        return "Figure{" +
                "length=" + length +
                '}';
    }

}

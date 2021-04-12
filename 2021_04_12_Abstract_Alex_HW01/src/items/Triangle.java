package items;

public class Triangle extends Figure {
    public Triangle() {
    }

    public Triangle(double length) {
        super(length);
    }

    @Override
    public double calcSquare() {
        return 0;
    }

    @Override
    public double calcPerimeter() {
        return length + length + length;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "length=" + length +
                '}';
    }
}

package items;

public class Square extends Figure {
    public Square() {
    }

    public Square(double length) {
        super(length);
    }

    @Override
    public double calcSquare() {
        return length * length;
    }

    @Override
    public double calcPerimeter() {
        return 4 * length;
    }

    @Override
    public String toString() {
        return "Square " + super.toString();
    }
}

package appl;

import items.Circle;
import items.Figure;
import items.Square;
import items.Triangle;

public class FigureApp {
    public static void main(String[] args) {
        Figure square = new Square(3.0);
        System.out.println(square);
        System.out.println("Perimeter of my Square " + square.calcPerimeter());
        System.out.println("Square of my Square " + square.calcSquare());
        System.out.println("======================");

        Figure circle = new Circle(3.0);
        System.out.println(circle);
        System.out.println("Perimeter of my Circle " + circle.calcPerimeter());
        System.out.printf("Square of my Circle %.2f ", circle.calcSquare());
        System.out.println();
        System.out.println("======================");

        Figure triangle = new Triangle(3.0);
        System.out.println(triangle);
        System.out.println("Perimeter of my Triangle " + triangle.calcPerimeter());
        System.out.printf("Square of my CTriangle  " + triangle.calcSquare());

    }
}

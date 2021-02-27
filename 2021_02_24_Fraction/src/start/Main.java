package start;

import calculator.Math;
import data.Fraction;

public class Main {
    public static void main(String[] args) {
        Fraction myFirstLovelyFraction = new Fraction(3, 5);
        // System.out.println(myFirstLovelyFraction);

        Fraction fr2 = new Fraction(5, 8);
        Fraction resultAddition = Math.addition(myFirstLovelyFraction, fr2);
        System.out.println(resultAddition);

        Fraction resultSubtraction = Math.subtraction(myFirstLovelyFraction, fr2);
        System.out.println(resultSubtraction);

        Fraction resultMultiplication = Math.multiplication(myFirstLovelyFraction, fr2);
        System.out.println(resultMultiplication);

        Fraction resultDivision = Math.division(myFirstLovelyFraction, fr2);
        System.out.println(resultDivision);

    }
}

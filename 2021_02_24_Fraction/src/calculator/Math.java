package calculator;

import data.Fraction;

public class Math {
    public static Fraction addition(Fraction a, Fraction b) {
        int cNumerator, cDenominator;
        //  знаменатель(cDenominator) = нок или leastCommonMultiple =
        // = leastCommonMultiple(a.getDenominator(), b.getDenominator());

        // числитель равен  а.числитель * cDenominator / а.деноманитор  +
        // + б.нумератор * cdenominator / b.denominator;
        cDenominator = leastCommonMultiple(a.getDenominator(), b.getDenominator());
        cNumerator = a.getNumerator() * cDenominator / a.getDenominator() + b.getNumerator() * cDenominator / b.getDenominator();


        int reduction=gcdRecursionAlgorithm(cNumerator, cDenominator);
        cNumerator = cNumerator / reduction;
        cDenominator = cDenominator /reduction;

        Fraction c = new Fraction(cNumerator, cDenominator);


        return c;
    }

    public static Fraction subtraction(Fraction a, Fraction b) {
        int cNumerator, cDenominator;
        cDenominator = leastCommonMultiple(a.getDenominator(), b.getDenominator());
        cNumerator = a.getNumerator() * cDenominator / a.getDenominator() - b.getNumerator() * cDenominator / b.getDenominator();

        int reduction=gcdRecursionAlgorithm(cNumerator, cDenominator);

        cNumerator = cNumerator / reduction;
        cDenominator = cDenominator /reduction;


        Fraction c = new Fraction(cNumerator, cDenominator);

        return c;
    }

    public static Fraction multiplication(Fraction a, Fraction b) {
        int cNumerator, cDenominator;
        cNumerator = a.getNumerator() * b.getNumerator();
        cDenominator = a.getDenominator() * b.getDenominator();

        int reduction=gcdRecursionAlgorithm(cNumerator, cDenominator);

        cNumerator = cNumerator / reduction;
        cDenominator = cDenominator /reduction;

        Fraction c = new Fraction(cNumerator, cDenominator);

        return c;
    }

    public static Fraction division(Fraction a, Fraction b) {
        int cNumerator, cDenominator;
        cNumerator = a.getNumerator() * b.getDenominator();
        cDenominator = a.getDenominator() * b.getNumerator();

        int reduction=gcdRecursionAlgorithm(cNumerator, cDenominator);

        cNumerator = cNumerator / reduction;
        cDenominator = cDenominator /reduction;

        Fraction c = new Fraction(cNumerator, cDenominator);

        return c;
    }


    //nod
    //nok
    public static int gcdRecursionAlgorithm(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdRecursionAlgorithm(b, a % b);
    }

    //nok
    public static int leastCommonMultiple(int a, int b) {
        return a / gcdRecursionAlgorithm(a, b) * b;
    }

}

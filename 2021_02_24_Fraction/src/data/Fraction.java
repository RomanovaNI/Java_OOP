package data;

import calculator.Math;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        denominator = 1;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator= " + numerator +
                ", denominator= " + denominator +
                '}';
    }

    public Fraction(Fraction a, Fraction b, char arithmeticOperationSymbol) {
        //проверка оператора
        Fraction frResult = Math.addition(a, b);
        this.numerator = frResult.getNumerator();
        this.denominator = frResult.getDenominator();
    }

    public void addAnotherFraction(Fraction b) {
        // что здесь должно стоять
        // что нам известно
        // первая дробь B. передена в сигнатуре метода.
        // вторая дробь this. numerator
        // this. denominator

        int d = Math.leastCommonMultiple(this.denominator, b.getDenominator());
        int n = this.numerator * d / this.denominator + b.getNumerator() * d / b.getDenominator();
        this.denominator = d / reduction(n, d);
        this.numerator = n / reduction(n, d);
        ;
    }

    public void subtractFraction(Fraction b) {
        int d = Math.leastCommonMultiple(this.denominator, b.getDenominator());
        int n = this.numerator * d / this.denominator - b.getNumerator() * d / b.getDenominator();
        this.denominator = d / reduction(n, d);
        this.numerator = n / reduction(n, d);
    }

    public void multiplyFraction(Fraction b) {
        int d = this.denominator * b.getDenominator();
        int n = this.numerator * b.getNumerator();
        this.denominator = d / reduction(n, d);
        this.numerator = n / reduction(n, d);
    }

    public void divideFraction(Fraction b) {
     /*   if (b.getNumerator() == 0 || b.getDenominator() == 0) {
            String stop = "stop";
            int d = this.denominator;
            int n = this.numerator;
            this.numerator = Integer.parseInt(stop);
            this.denominator = Integer.parseInt(stop);
        } else {*/

            int d = this.denominator * b.getNumerator();
            int n = this.numerator * b.getDenominator();
            this.denominator = d / reduction(n, d);
            this.numerator = n / reduction(n, d);
       // }
    }


    private void reduction() {

        // сокращение дроби
        // this.n
        // this.d
    }

    private int reduction(int n, int d) {
        int reduction = Math.gcdRecursionAlgorithm(n, d);
        //нод
        return reduction;
    }
}

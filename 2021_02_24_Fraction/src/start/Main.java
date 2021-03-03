package start;

import calculator.Math;
import data.Fraction;

public class Main {
    public static void main(String[] args) {
        Fraction myFirstLovelyFraction = new Fraction(15, 5);
        // System.out.println(myFirstLovelyFraction);

        Fraction fr2 = new Fraction(5, 15);
        Fraction resultAddition = Math.addition(myFirstLovelyFraction, fr2);
        System.out.println(resultAddition);

        Fraction resultSubtraction = Math.subtraction(myFirstLovelyFraction, fr2);
        System.out.println(resultSubtraction);

        Fraction resultMultiplication = Math.multiplication(myFirstLovelyFraction, fr2);
        System.out.println(resultMultiplication);

        Fraction resultDivision = Math.division(myFirstLovelyFraction, fr2);
        System.out.println(resultDivision);


        Fraction frA = new Fraction(27, 50);
        Fraction frB = new Fraction(23, 50);

        //Ожидаю 1

        Fraction frResult = Math.addition(frA, frB);
        System.out.println(frResult);

        Fraction frminus = Math.subtraction(frA, frB);
        System.out.println(frminus);

        Fraction testNewMethod = new Fraction(frA, frB, '+');


        Fraction a = new Fraction(15,5);
        Fraction b = new Fraction(5,15);

        System.out.println("----------------------------------Add");
        a.addAnotherFraction(b);
        System.out.println(a);

        Fraction aS = new Fraction(15,5);
        Fraction bS = new Fraction(5,15);

        System.out.println("----------------------------------Subtract");
        aS.subtractFraction(bS);
        System.out.println(aS);

        Fraction aM = new Fraction(15,5);
        Fraction bM = new Fraction(5,15);

        System.out.println("----------------------------------Multiply");
        aM.multiplyFraction(bM);
        System.out.println(aM);

        Fraction aD = new Fraction(15,5);
        Fraction bD = new Fraction(0,0);

        System.out.println("----------------------------------Divide");
        aD.divideFraction(bD);
        System.out.println(aD);

    }


    }


package at.campus02.bsd;/*
 * Project: UB03 MAVEN
 * Author: Benjamin Lamprecht
 * Last Change: 06.04.2022
 */

public class Calculator {

    public Calculator() {
    }

    public double add(double number1, double number2) {
        return number1 + number2;
    }

    public double minus(double number1, double number2) {
        return number1 - number2;
    }

    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public int divide(int number1, int number2) throws ArithmeticException {
        int number = number1 / number2;
        return number;
    }

    public int faculty(int number) {
        if (number < 0)
            return 0;
        if (number< 2) {
            return 1;
        }
        return faculty(number-1) * number;
    }
}

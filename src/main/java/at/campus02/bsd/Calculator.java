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

    public double divide(double number1, double number2) {
        return number1 * number2;
    }

    public int faculty(int number) {
        if (number< 2) {
            return 1;
        }
        return faculty(number-1) * number;
    }
}

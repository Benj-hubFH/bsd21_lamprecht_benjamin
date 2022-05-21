package at.campus02.bsd;/*
 * Project: UB03 MAVEN
 * Author: Benjamin Lamprecht
 * Last Change: 11.04.2022
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {



        logger.error("this is debug");
        logger.info("this isn't written in console");


        Calculator calculator = new Calculator();

        //as visual check for console output
        //System.out.println(calculator.add(1, 1));
        //System.out.println(calculator.minus(1, 1));
        //System.out.println(calculator.multiply(1,1));
        //System.out.println(calculator.divide(1,1));
        //System.out.println(calculator.faculty(4,1));

    }
}

package com.aut;

public class AUTMath {
    /**
     * gets two doubles and returns their sum.
     *
     * @param num1 the num 1
     * @param num2 the num 2
     * @return double
     */
    public static double sum(double num1, double num2) {
        return num1+num2;
    }

    /**
     * gets two doubles and returns their subtraction.
     *
     * @param num1 the num 1
     * @param num2 the num 2
     * @return double
     */
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * gets two numbers and returns their subtraction.
     *
     * @param num1 the num 1
     * @param num2 the num 2
     * @return double
     */
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * gets two numbers and returns their division.
     *
     * @param num1 the num 1
     * @param num2 the num 2
     * @return double
     */
    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    /**
     * gets a number and returns its factorial.
     *
     * @param number the number
     * @return double
     */
    public static double factorial(double number) {
        double result = 0;

        for (int counter = 0; counter < number; counter++) {
            result = multiply(result, number);
        }
        return result;
    }

    /**
     * gets a base and a power and calculates base in power of the input.
     *
     * @param base  the base
     * @param power the power
     * @return double
     */
    public static double pow(double base, double power) {
        double result = 1;

        for (int counter = 1; counter <= base; counter++) {
            result = multiply(result, power);
        }

        return result;
    }

    /**
     * gets an index and calculates the fibonacci sequence at that exact index recursively.
     *
     * @param index the index
     * @return double
     */
    public static double fib(int index) {
        if (index == 0 || index == 1) {
            return index;
        }

        return fib(index-1);
    }
}
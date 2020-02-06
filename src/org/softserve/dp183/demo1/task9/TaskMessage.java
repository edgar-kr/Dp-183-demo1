package org.softserve.dp183.demo1.task9;

import java.text.DecimalFormat;

/**
 * Created by User on 05.02.2020.
 */
class TaskMessage {

    static void askNumber() {
        System.out.println("Enter number: ");
    }

    static void askPow() {
        System.out.println("Enter power: ");
    }

    static void errorMessage() {
        System.out.println("You must enter integer number");
        System.out.println("Please try again: ");
    }

    static void printResult(Number value) {
        DecimalFormat decimalFormat = new DecimalFormat("###,###.######");
        System.out.printf("Result is %s%n", decimalFormat.format(value));
    }
}

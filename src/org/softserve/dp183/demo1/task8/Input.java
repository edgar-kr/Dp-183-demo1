package org.softserve.dp183.demo1.task8;

import java.util.List;

/**
 * Created by User on 12.02.2020.
 */
public class Input {
    private Input() {
    }

    public static void taskText() {
        System.out.println("You can get Fibonacci sequence in 2 ways:\n" +
                "1. Enter 1 parameter: amount of digits\n" +
                "2. Enter interval: start and end");
    }

    public static void wrongParamsFormat() {
        System.out.println("Number(s) must be natural");
    }

    public static void wrongParamsCount() {
        System.out.println("Wrong number of parameters");
    }

    public static void printSequence(List<Long> fibSequence) {
        fibSequence.forEach(System.out::println);
    }
}

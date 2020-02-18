package org.softserve.dp183.demo1.task6;

import javafx.util.Pair;

import java.util.Scanner;

/**
 * Created by User on 18.02.2020.
 */
public class InputHandler {

    public static Pair<Integer, Integer> getInterval() {
        String[] array = getStringWithTwoParams().split("[ ,]+");

        int start = Integer.parseInt(array[0]);
        int end = Integer.parseInt(array[1]);

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        return new Pair<>(start, end);
    }

    private static String getStringWithTwoParams() {
        String params = "";
        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            Output.requestInput();
            params = scanner.nextLine();

            if (params.matches("\\s*[0-9]{1,6}[ ,]+[0-9]{1,6}\\s*")) {
                break;
            }
            Output.wrongInput();
        }

        return params.trim();
    }
}

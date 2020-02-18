package org.softserve.dp183.demo1.task6;

import java.util.Map;

/**
 * Created by User on 18.02.2020.
 */
public class Output {

    public static void requestInput() {
        System.out.println("Please enter 2 ticket numbers(start, end):");
    }

    public static void wrongInput() {
        System.out.println("Wrong input(example: 125156 888888");
    }

    public static void printResult(Map<LuckyTicket, Integer> luckyTickets) {
        System.out.println("=============LuckyTickets=============");
        for (Map.Entry<LuckyTicket, Integer> pair : luckyTickets.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}

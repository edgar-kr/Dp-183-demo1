package org.softserve.dp183.demo1.task6;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 17.02.2020.
 */
public class Controller {

    public void work() {
        int[] interval = InputHandler.getInterval();

        Map<LuckyTicket, Integer> luckyTickets = new HashMap<>();
        luckyTickets.put(new MoscowLuckyTicket(), 0);
        luckyTickets.put(new PiterLuckyTicket(), 0);
        luckyTickets.put(new DniproLuckyTicket(), 0);

        for (int i = interval[0]; i <= interval[1]; i++) {
            for (Map.Entry<LuckyTicket, Integer> pair : luckyTickets.entrySet()) {
                if (pair.getKey().isLucky(i)) {
                    luckyTickets.put(pair.getKey(), luckyTickets.get(pair.getKey()) + 1);
                }
            }
        }

        Output.printResult(luckyTickets);
    }

}

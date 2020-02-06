package org.softserve.dp183.demo1.task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 05.02.2020.
 */
class TaskController {

    void work() {
        QuickPow quickPow = new QuickPow();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            TaskMessage.askNumber();

            long number = NumValidator.getNumber(reader);

            TaskMessage.askPow();

            long pow = NumValidator.getNumber(reader);

            TaskMessage.printResult(quickPow.getQuickPow(number, pow));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

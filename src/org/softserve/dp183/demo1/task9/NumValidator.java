package org.softserve.dp183.demo1.task9;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by User on 05.02.2020.
 */
class NumValidator {

    static long getNumber(BufferedReader reader) throws IOException {
        long result = 0;

        for (; ; ) {
            try {
                result = Long.parseLong(reader.readLine());
                break;
            } catch (NumberFormatException e) {
                TaskMessage.errorMessage();
            }
        }

        return result;
    }
}



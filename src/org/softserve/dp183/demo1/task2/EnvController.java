package org.softserve.dp183.demo1.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by User on 02.02.2020.
 */
public class EnvController {


    public void work() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        EnvValidator validator = new EnvValidator(reader);

        for (; ; ) {
            ArrayList<Double> validatedParams = validator.validateEnvSides();

            Envelope envelope1 = new Envelope(validatedParams.get(0), validatedParams.get(1));
            Envelope envelope2 = new Envelope(validatedParams.get(2), validatedParams.get(3));

            boolean canFit = new EnvelopeComparator(envelope1, envelope2).compare();
            EnvMessage.printResult(canFit);

            try {
                EnvMessage.askOnceMore();
                String answer = reader.readLine();

                if (!(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")))
                    return;
            } catch (IOException e) {
                return;
            }
        }
    }
}

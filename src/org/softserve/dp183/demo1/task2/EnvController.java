package org.softserve.dp183.demo1.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 02.02.2020.
 */
public class EnvController {
    public void work() {
        EnvValidator validator;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            validator = new EnvValidator(reader);

            for (; ; ) {
                double[] params = validator.validateEnvSides();

                Envelope envelope1 = new Envelope(params[0], params[1]);
                Envelope envelope2 = new Envelope(params[2], params[3]);

                EnvelopeComparator comparator = new EnvelopeComparator();
                boolean canFit = comparator.compare(envelope1, envelope2) == 1;

                EnvMessage.printResult(canFit);

                if (validator.validateStop()) {break;}
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

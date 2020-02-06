package org.softserve.dp183.demo1.task2;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by User on 03.02.2020.
 */
class EnvValidator {
    private BufferedReader reader;

    EnvValidator(BufferedReader reader) {
        this.reader = reader;
    }

    double[] validateEnvSides() throws IOException {
        double[] params = new double[4];

        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                EnvMessage.askEnvelope();
            }

            while (true) {
                try {
                    EnvMessage.askSide();

                    params[i] = valSide();

                    EnvMessage.incrementSideCount();

                    break;
                } catch (WrongSideException | NumberFormatException e) {
                    System.out.println("Please enter natural number");
                }
            }
        }

        return params;
    }

    boolean validateStop() throws IOException {
        EnvMessage.askOnceMore();

        String message = reader.readLine();

        return !(message.equalsIgnoreCase("y") || message.equalsIgnoreCase("yes"));
    }

    private double valSide() throws WrongSideException, IOException {
        double result = Double.parseDouble(reader.readLine());

        if (result <= 0) throw new WrongSideException();

        return result;
    }
}

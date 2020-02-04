package org.softserve.dp183.demo1.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by User on 03.02.2020.
 */
public class EnvValidator {
    private BufferedReader reader;
    private ArrayList<Double> list;

    public EnvValidator(BufferedReader reader) {
        this.reader = reader;
        list = new ArrayList<>();
    }

    public ArrayList<Double> validateEnvSides() {
        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                EnvMessage.askEnvelope();
            }

            while (true) {
                try {
                    EnvMessage.askSide();

                    double side = parseSide();
                    list.add(side);

                    EnvMessage.incrementSideCount();

                    break;
                } catch (WrongSideException | NumberFormatException | IOException e) {
                    System.out.println("Please enter natural number");
                }
            }
        }

        return list;
    }

    private double parseSide() throws WrongSideException, IOException {
        double result = Double.parseDouble(reader.readLine());

        if (result <= 0) throw new WrongSideException("You must enter natural number");

        return result;
    }
}

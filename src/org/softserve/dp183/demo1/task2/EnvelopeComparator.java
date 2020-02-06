package org.softserve.dp183.demo1.task2;

import java.util.Comparator;

/**
 * Created by User on 28.01.2020.
 */
public class EnvelopeComparator implements Comparator<Envelope> {
    @Override
    public int compare(Envelope env1, Envelope env2) {
        double sideA1 = env1.getBigSide();
        double sideA2 = env1.getSmallSide();
        double sideB1 = env2.getBigSide();
        double sideB2 = env2.getSmallSide();

        if (((sideA1 <= sideB1) && (sideA2 <= sideB2)) ||
                ((sideA1 > sideB1) && (sideA2 <= sideB2) && compareFormula(sideA1, sideA2, sideB1, sideB2))) {
            return 1;
        }
        return 0;
    }

    private boolean compareFormula(double sideA1, double sideA2, double sideB1, double sideB2) {
        double arg1 = Math.pow(((sideB1 + sideB2) / (sideA1 + sideA2)), 2);
        double arg2 = Math.pow(((sideB1 - sideB2) / (sideA1 - sideA2)), 2);

        return arg1 + arg2 >= 2;
    }
}

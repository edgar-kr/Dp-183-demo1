package org.softserve.dp183.demo1.task8;

/**
 * Created by User on 12.02.2020.
 */
public class FibonacciNumber {
    public static final double GOLDEN_RATIO = (1 + Math.sqrt(5)) / 2;
    public static final double ALFA = 1 / Math.log(GOLDEN_RATIO);
    public static final double BETA = Math.log(Math.sqrt(5)) / Math.log(GOLDEN_RATIO);

    long getFibNumberByIndex(int index) {
        return Math.round(Math.pow(GOLDEN_RATIO, index) / Math.sqrt(5));
    }

    int getNextIndex(long start) {
        double index = ALFA * Math.log(start) + BETA;

        if ((int) index == 2) {
            index = 1;
        }

        index -= 0.00001;
        return (int) Math.ceil(index);
    }

    int getPreviousIndex(long end) {
        double index = (ALFA * Math.log(end) + BETA);

        index += 0.00001;

        return (int) index;
    }

    int getLastIndex(int digitsCount) {
        return (int) (((Math.log10(5) / 2) + digitsCount) / Math.log10(GOLDEN_RATIO));
    }
}

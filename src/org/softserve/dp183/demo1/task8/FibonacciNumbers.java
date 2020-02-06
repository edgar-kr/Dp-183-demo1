package org.softserve.dp183.demo1.task8;

/**
 * Created by User on 06.02.2020.
 */
public class FibonacciNumbers {
    private final double GOLDEN_RATIO = 1.6180339887;
    private final double G = 0.6180339887;
    private int number;

    public FibonacciNumbers(int number) {
        this.number = number;
    }

    private int countDigits(long number) {
        int count = 0;

        while (number != 0) {
            number /= 10;
            count++;
        }

        return count;
    }

    int fibonacci() {
        int index = (int) (((Math.log10(5) / 2) + countDigits(number)) / Math.log10(GOLDEN_RATIO));
        int numberFib = (int) Math.ceil((Math.pow(GOLDEN_RATIO, index) - Math.pow(G, index)) / Math.pow(5, 0.5));

        return numberFib;
    }
}

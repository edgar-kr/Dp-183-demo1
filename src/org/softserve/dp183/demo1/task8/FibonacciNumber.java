package org.softserve.dp183.demo1.task8;

/**
 * Created by User on 06.02.2020.
 */
public class FibonacciNumber {
    private final double GOLDEN_RATIO = 1.6180339887;

    int countDigits(long number) {
        int count = 0;

        while (number != 0) {
            number /= 10;
            count++;
        }

        return count;
    }

    int getLastIndex(int digitsCount) {
        return (int) (((Math.log10(5) / 2) + digitsCount) / Math.log10(GOLDEN_RATIO));
    }

    long getFibNumByIndex(int index) {
        long numberFib = (long) Math.ceil((Math.pow(GOLDEN_RATIO, index) - Math.pow(GOLDEN_RATIO - 1, index)) / Math.pow(5, 0.5));

        return numberFib;
    }

  //  int getIndexByNumber(long number){

  //  }
}

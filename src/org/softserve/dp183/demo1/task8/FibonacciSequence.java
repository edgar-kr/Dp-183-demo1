package org.softserve.dp183.demo1.task8;

import java.util.ArrayList;

/**
 * Created by User on 06.02.2020.
 */
class FibonacciSequence {
    private FibonacciNumber fibNumber;

    public FibonacciSequence() {
        this.fibNumber = new FibonacciNumber();
    }

    ArrayList<Long> getNumbersTask1(int length) {
        ArrayList<Long> fibList = new ArrayList<>();

        int lastIndex = fibNumber.getLastIndex(length);
        int firstIndex = fibNumber.getLastIndex(length - 1) + 1;

        if (firstIndex == 2) {
            firstIndex -= 1;
        }

        for (int i = firstIndex; i <= lastIndex; i++) {
            fibList.add(fibNumber.getFibNumByIndex(i));
        }

        return fibList;
    }

    ArrayList<Long> getNumbersTask2(long start, long end) {
        ArrayList<Long> fibList = new ArrayList<>();

        int firstIndex = fibNumber.getLastIndex(fibNumber.countDigits(start) - 1) + 1;

        long value = fibNumber.getFibNumByIndex(firstIndex);

        for (int i = firstIndex; value <= end; i++) {
            value = fibNumber.getFibNumByIndex(i);
            if (value >= start && value <= end) {
                fibList.add(value);
            }
        }

        return fibList;
    }
}

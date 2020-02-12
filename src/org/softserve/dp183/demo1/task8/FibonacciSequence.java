package org.softserve.dp183.demo1.task8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 06.02.2020.
 */
class FibonacciSequence {
    private FibonacciNumber fibNumber;

    public FibonacciSequence() {
        this.fibNumber = new FibonacciNumber();
    }

    List<Long> getSequence(int length) {
        List<Long> fibList = new ArrayList<>();

        int firstIndex = (length == 1) ? 1 : (fibNumber.getLastIndex(length - 1) + 1);
        int lastIndex = fibNumber.getLastIndex(length);

        for (int i = firstIndex; i <= lastIndex; i++) {
            fibList.add(fibNumber.getFibNumberByIndex(i));
        }

        return fibList;
    }

    List<Long> getSequence(long start, long end) {
        List<Long> fibList = new ArrayList<>();

        int firstIndex = fibNumber.getNextIndex(start);
        int lastIndex = fibNumber.getPreviousIndex(end);

        for (int i = firstIndex; i <= lastIndex; i++) {
            fibList.add(fibNumber.getFibNumberByIndex(i));
        }

        return fibList;
    }
}

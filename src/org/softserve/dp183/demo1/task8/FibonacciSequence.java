package org.softserve.dp183.demo1.task8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * Created by User on 06.02.2020.
 */
class FibonacciSequence {
    private FibonacciNumber fibNumber;

    public FibonacciSequence() {
        this.fibNumber = new FibonacciNumber();
    }

    List<Long> getSequence(int length) {

        return getSequence(
                () -> (length == 1) ? 1 : (fibNumber.getLastIndex(length - 1) + 1),
                () -> fibNumber.getLastIndex(length));
    }

    List<Long> getSequence(long start, long end) {

        return getSequence(
                () -> fibNumber.getNextIndex(start),
                () -> fibNumber.getPreviousIndex(end));
    }

    List<Long> getSequence(Supplier<Integer> start, Supplier<Integer> end) {
        List<Long> fibList = new ArrayList<>();

        for (int i = start.get(); i <= end.get(); i++) {
            fibList.add(fibNumber.getFibNumberByIndex(i));
        }

        return fibList;
    }

}

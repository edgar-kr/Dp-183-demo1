package org.softserve.dp183.demo1.task7;

import java.util.StringJoiner;

/**
 * Created by User on 29.01.2020.
 */
public class NumSequence {
    private int n;
    private StringJoiner sequence;

    public NumSequence(int n) {
        this.n = n;
    }

    private void addNumbers(int n) {
        int lastNumb = (int) Math.sqrt(n);
        sequence = new StringJoiner(",");

        for (int i = 1; i <= lastNumb; i++) {
            sequence.add(Integer.toString(i));
        }
    }

    public void printSequence() {
        addNumbers(n);
        System.out.println(sequence);
    }
}

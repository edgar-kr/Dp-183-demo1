package org.softserve.dp183.demo1.task7;

import java.util.StringJoiner;

/**
 * Created by User on 02.02.2020.
 */
class PrintSequence {
    private NumSequence sequence;

    PrintSequence(NumSequence sequence) {
        this.sequence = sequence;
    }

    void print() {
        StringJoiner joiner = new StringJoiner(",");

        for (Integer num : sequence.getSequence()) {
            joiner.add(Integer.toString(num));
        }

        System.out.println(joiner);
    }
}

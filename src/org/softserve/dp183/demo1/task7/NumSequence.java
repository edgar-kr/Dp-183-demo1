package org.softserve.dp183.demo1.task7;

import java.util.ArrayList;


/**
 * Created by User on 29.01.2020.
 */
class NumSequence {
    private ArrayList<Integer> sequence;
    private int param;

    NumSequence(int param) {
        this.param = param;
        this.sequence = new ArrayList<>();
    }

    ArrayList<Integer> getSequence() {
        int lastNumb = (int) Math.sqrt(param);

        for (int i = 1; i <= lastNumb; i++) {
            sequence.add(i);
        }

        return sequence;
    }
}

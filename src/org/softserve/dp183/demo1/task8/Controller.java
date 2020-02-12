package org.softserve.dp183.demo1.task8;

import java.io.IOException;

/**
 * Created by User on 12.02.2020.
 */
public class Controller {

    public void work(String[] args) {
        long[] params = new ParamsValidator().validate(args);

        FibonacciSequence sequence = new FibonacciSequence();

        if (params.length == 1) {
            Input.printSequence(sequence.getSequence((int) params[0]));
        } else {
            Input.printSequence(sequence.getSequence(params[0], params[1]));
        }
    }
}

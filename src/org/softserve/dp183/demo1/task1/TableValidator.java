package org.softserve.dp183.demo1.task1;

/**
 * Created by User on 03.02.2020.
 */
public class TableValidator {

    public int[] validateTwoNums(String[] args) {
        int height = Integer.parseInt(args[0]);
        int length = Integer.parseInt(args[1]);

        if (height <= 0 || length <= 0) throw new NumberFormatException();

        return new int[]{height, length};
    }

}

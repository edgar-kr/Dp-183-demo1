package org.softserve.dp183.demo1.task3;

/**
 * Created by User on 29.01.2020.
 */
public class TriangleCreationException extends Exception {
    public TriangleCreationException() {
        super("triangle can't be created with these sides");
    }
}

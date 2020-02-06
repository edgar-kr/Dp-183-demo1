package org.softserve.dp183.demo1.task4;

/**
 * Created by User on 05.02.2020.
 */
public class FileDoesNotExistException extends Exception {
    public FileDoesNotExistException(String message) {
        super(message);
    }
}

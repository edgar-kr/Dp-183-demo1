package org.softserve.dp183.demo1.task4;

import java.io.File;

/**
 * Created by User on 03.02.2020.
 */
class DataValidator {
    public static boolean validateCount(String[] args) throws NotEnoughParamsException {
        if (args.length < 2) throw new NotEnoughParamsException("Not enough params");

        return true;
    }

    public static boolean validateFile(File fileName) throws FileDoesNotExistException {
        if (!(fileName.exists())) throw new FileDoesNotExistException("This file doesn't exist");

        return true;
    }
}

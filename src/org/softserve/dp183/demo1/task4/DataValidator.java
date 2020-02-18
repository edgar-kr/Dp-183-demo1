package org.softserve.dp183.demo1.task4;


import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by User on 03.02.2020.
 */
class DataValidator {
    public static boolean validateCount(String[] args) throws NotEnoughParamsException {
        if (args.length < 2) throw new NotEnoughParamsException("Not enough params");

        return true;
    }

    public static boolean validateFile(String[] args) throws FileDoesNotExistException {
        if (Files.notExists(Paths.get(args[0]))) throw new FileDoesNotExistException("This file doesn't exist");

        return true;
    }
}

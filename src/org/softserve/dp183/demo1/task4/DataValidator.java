package org.softserve.dp183.demo1.task4;

import java.io.File;

/**
 * Created by User on 03.02.2020.
 */
class DataValidator {
    private String[] args;

    DataValidator(String[] args) {
        this.args = args;
    }

    public void validateCount() throws NotEnoughParamsException {
        if (args.length < 2) throw new NotEnoughParamsException("Not enough params");
    }

    public File validateFile() throws FileDoesNotExistException {
        File file = new File(args[0]);
        if (!file.exists()) throw new FileDoesNotExistException("This file doesn't exist");
        return file;
    }
}

package org.softserve.dp183.demo1.task4;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by User on 03.02.2020.
 */
class DataValidator {
    private String[] args;

    DataValidator(String[] args) {
        this.args = args;
    }

    int paramsCount() throws NotEnoughParamsException {
        if (args.length < 2) throw new NotEnoughParamsException();
        return args.length;
    }

    boolean validateParams() throws NotEnoughParamsException, FileNotFoundException {
        paramsCount();

        File file = new File(args[0]);
        if (!file.exists()) throw new FileNotFoundException();

        return true;
    }
}

package org.softserve.dp183.demo1.task7;

/**
 * Created by User on 04.02.2020.
 */
class ParamValidator {
    private String[] args;

    ParamValidator(String[] args) {
        this.args = args;
    }

    boolean validate() throws WrongParameterException {
        int param = Integer.parseInt(args[0]);

        if (param <= 0) throw new WrongParameterException();

        return true;
    }
}

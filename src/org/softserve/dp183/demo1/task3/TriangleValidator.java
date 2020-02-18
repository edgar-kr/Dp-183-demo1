package org.softserve.dp183.demo1.task3;

import java.util.TreeSet;

/**
 * Created by User on 04.02.2020.
 */
public class TriangleValidator {
    private String[] args;

    public TriangleValidator(String[] args) {
        this.args = args;
    }

    boolean validateParams() throws TriangleCreationException, WrongParamsCountException {
        return validateParamCount() && validateSides();

    }

    private boolean validateSides() throws TriangleCreationException {
        double side1 = Double.parseDouble(args[1]);
        double side2 = Double.parseDouble(args[2]);
        double side3 = Double.parseDouble(args[3]);

        if (((side1 + side2) <= side3)
                || ((side1 + side3) <= side2)
                || ((side2 + side3) <= side1)
                || (side1 <= 0) || (side2 <= 0) || (side3 <= 0))
            throw new TriangleCreationException();

        return true;
    }

    private boolean validateParamCount() throws WrongParamsCountException {
        if (args.length != 4) throw new WrongParamsCountException("Wrong number of parameters");

        return true;
    }

}

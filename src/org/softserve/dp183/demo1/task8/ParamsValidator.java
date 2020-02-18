package org.softserve.dp183.demo1.task8;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by User on 12.02.2020.
 */
public class ParamsValidator {

    public long[] validate(String[] args) {
        if (args.length < 1) {
            Input.wrongParamsCount();
        }
        try {
            if (args.length == 1) {
                return new long[]{getOneParam(args[0])};
            } else if (args.length >= 2) {
                return getTwoParams(args);
            }
        } catch (NumberFormatException | NumberIsNotNaturalException e) {
            Input.wrongParamsFormat();
        }

        return getNewParams();
    }

    private int getOneParam(String arg) throws NumberIsNotNaturalException {
        int param = Integer.parseInt(arg);

        if (param > 0) {
            return param;
        } else {
            throw new NumberIsNotNaturalException();
        }
    }

    private long[] getTwoParams(String[] args) throws NumberIsNotNaturalException {
        long[] params = new long[2];
        params[0] = Long.parseLong(args[0]);
        params[1] = Long.parseLong(args[1]);

        if (params[0] > 0 && params[1] > 0) {
            Arrays.sort(params);
            return params;
        } else {
            throw new NumberIsNotNaturalException();
        }
    }

    private long[] getNewParams() {
        Scanner scanner = new Scanner(System.in);

        long[] params = new long[2];

        for (; ; ) {
            Input.taskText();
            String str = scanner.nextLine();

            if (str.matches("[0-9][0-9 ]+")) {
                String[] strArray = str.split("\\s+");

                for (int i = 0; i < strArray.length; i++) {
                    params[i] = Long.parseLong(strArray[i]);
                }
                Arrays.sort(params);
                break;
            }

            Input.wrongParamsFormat();
        }

        return params;
    }


}

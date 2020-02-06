package org.softserve.dp183.demo1.task9;

/**
 * Created by User on 05.02.2020.
 */
class QuickPow {

    private long getNumPow(long num, long pow) {
        long result = 1;

        while (pow > 0) {
            if (pow % 2 != 0) {
                result *= num;
                pow--;
            }

            num *= num;
            pow /= 2;
        }

        return result;
    }

    Number getQuickPow(long num, long pow) {
        if (pow < 0) {
            return 1.0 / getNumPow(num, Math.abs(pow));
        } else {
            return getNumPow(num, pow);
        }
    }
}

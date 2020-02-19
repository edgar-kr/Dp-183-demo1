package org.softserve.dp183.demo1.task6;

/**
 * Created by User on 14.02.2020.
 */
public class MoscowLuckyTicket implements LuckyTicket {
    private int digits;

    public MoscowLuckyTicket() {
        this.digits = 6;
    }

    public boolean isLucky(int ticket) {
        int num1 = (int) (ticket / Math.pow(10, digits / 2));
        int num2 = (int) (ticket % (Math.pow(10, digits / 2)));

        return sumOfDigits(num1) == sumOfDigits(num2);
    }

    private int sumOfDigits(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    @Override
    public String toString() {
        return "MoscowLuckyTicket";
    }
}

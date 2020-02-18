package org.softserve.dp183.demo1.task6;

/**
 * Created by User on 17.02.2020.
 */
public class DniproLuckyTicket implements LuckyTicket{

    public boolean isLucky(int ticket) {
        int evenSum = 0;
        int unEvenSum = 0;

        while (ticket > 0) {
            int digit = ticket % 10;

            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                unEvenSum += digit;
            }

            ticket /= 10;
        }

        return evenSum == unEvenSum;
    }

    @Override
    public String toString() {
        return "DniproLuckyTicket";
    }
}

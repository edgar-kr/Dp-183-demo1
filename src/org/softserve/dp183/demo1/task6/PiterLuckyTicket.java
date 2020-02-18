package org.softserve.dp183.demo1.task6;

/**
 * Created by User on 17.02.2020.
 */
public class PiterLuckyTicket implements LuckyTicket{

    public boolean isLucky(int ticket) {
        int evenIndexSum = 0;
        int unEvenIndexSum = 0;

        while (ticket > 0) {
            int digit = ticket % 10;
            evenIndexSum += digit;
            ticket /= 10;

            digit = ticket % 10;
            unEvenIndexSum += digit;
            ticket /= 10;
        }

        return evenIndexSum == unEvenIndexSum;
    }

    @Override
    public String toString() {
        return "PiterLuckyTicket";
    }
}

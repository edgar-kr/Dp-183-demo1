package org.softserve.dp183.demo1.task7;

/**
 * Created by User on 28.01.2020.
 */
public class Task7 {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(args[0]);
            if (n <= 0) throw new NumberFormatException();

            new NumSequence(n).printSequence();
        } catch (NumberFormatException e) {
            System.out.println("wrong parameter");
        }
    }

}

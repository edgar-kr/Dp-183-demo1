package org.softserve.dp183.demo1.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 28.01.2020.
 */
public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a, b, c, d;

        System.out.println("Enter first envelope sides:");
        System.out.print("side1 = ");

        a = Double.parseDouble(reader.readLine());

        System.out.print("side2 = ");

        b = Double.parseDouble(reader.readLine());

        System.out.println("Enter second envelope sides:");
        System.out.print("side1 = ");

        c = Double.parseDouble(reader.readLine());

        System.out.print("side2 = ");

        d = Double.parseDouble(reader.readLine());

        Envelope envelope1 = new Envelope(a, b);
        Envelope envelope2 = new Envelope(c, d);

        new EnvelopeComparator(envelope1,envelope2).envCompare();
    }
}

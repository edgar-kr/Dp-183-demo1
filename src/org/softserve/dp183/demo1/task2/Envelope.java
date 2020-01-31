package org.softserve.dp183.demo1.task2;

/**
 * Created by User on 28.01.2020.
 */
public class Envelope {
    private double side1;
    private double side2;

    public Envelope(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }
}

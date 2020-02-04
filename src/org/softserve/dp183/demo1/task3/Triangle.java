package org.softserve.dp183.demo1.task3;


import java.util.Objects;

/**
 * Created by User on 29.01.2020.
 */
public class Triangle implements Comparable<Triangle> {
    private String name;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String name, double side1, double side2, double side3) {
        this.name = name;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public String getName() {
        return name;
    }

    public double getAreaHeron() {
        double semiPer = getSemiPer();
        return Math.sqrt(semiPer * (semiPer - side1) * (semiPer - side2) * (semiPer - side3));
    }

    private double getSemiPer() {
        return (side1 + side2 + side3) / 2;
    }

    @Override
    public int compareTo(Triangle triangle) {
        if (this.getName().equals(triangle.getName())) return 0;

        int comp = Double.compare(triangle.getAreaHeron(), this.getAreaHeron());
        if (comp == 0) {
            comp = this.getName().compareTo(triangle.getName());
        }

        return comp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return this.getName().equals(triangle.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

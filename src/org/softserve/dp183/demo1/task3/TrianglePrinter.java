package org.softserve.dp183.demo1.task3;

import java.text.DecimalFormat;
import java.util.TreeSet;

/**
 * Created by User on 29.01.2020.
 */
public class TrianglePrinter {
    private TreeSet<Triangle> set;

    public TrianglePrinter(TreeSet<Triangle> set) {
        this.set = set;
    }

    public void print() {
        System.out.println("============= Triangles list: ===============");

        for (Triangle triangle : set) {
            System.out.printf("[Triangle %s]: %s cm", triangle.getName(), getAreaFormat(triangle));
            System.out.println();
        }
    }

    private String getAreaFormat(Triangle triangle) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return decimalFormat.format(triangle.getAreaHeron());
    }
}

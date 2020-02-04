package org.softserve.dp183.demo1.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

/**
 * Created by User on 29.01.2020.
 */
public class TriangleFiller {
    private TreeSet<Triangle> set;

    TriangleFiller() {
        set = new TreeSet<>();
    }

    TreeSet<Triangle> getSet() {
        return set;
    }

    void addTriangles(String[] array) {
        String name;
        double side1;
        double side2;
        double side3;

        name = array[0].trim();
        side1 = Double.parseDouble(array[1]);
        side2 = Double.parseDouble(array[2]);
        side3 = Double.parseDouble(array[3]);

        Triangle triangle = new Triangle(name, side1, side2, side3);

        set.add(triangle);
    }
}

package org.softserve.dp183.demo1.task3;

import java.io.IOException;

/**
 * Created by User on 29.01.2020.
 */
public class Task3 {
    public static void main(String[] args) throws IOException {
        TriangleFiller triangleFiller = new TriangleFiller();
        triangleFiller.addTriangles();

        TrianglePrinter trianglePrinter = new TrianglePrinter(triangleFiller.getSet());
        trianglePrinter.print();
    }
}

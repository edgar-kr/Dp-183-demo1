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

    public TriangleFiller() {
        set = new TreeSet<>();
    }

    public TreeSet<Triangle> getSet() {
        return set;
    }

    public void addTriangles() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strArray;
        boolean flag = true;
        String goOnMessage;

        while (flag) {
            try {
                System.out.println("Enter triangle name and 3 sides: ");
                strArray = reader.readLine().split(",");

                fillSet(strArray);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("wrong number of parameters");
            } catch (NumberFormatException e) {
                System.out.println("wrong sides format");
            } catch (TriangleCreationException e) {
                System.out.println(e.getMessage());
            }

            System.out.println();
            System.out.print("Do you want to continue: ");

            goOnMessage = reader.readLine();
            System.out.println();

            if (!(goOnMessage.equalsIgnoreCase("y") || goOnMessage.equalsIgnoreCase("yes"))) flag = false;
        }
        reader.close();
    }

    private void fillSet(String[] array) throws TriangleCreationException {
        String name;
        double side1;
        double side2;
        double side3;

        if (array.length != 4) throw new IndexOutOfBoundsException();

        name = array[0].trim();
        side1 = Double.parseDouble(array[1]);
        side2 = Double.parseDouble(array[2]);
        side3 = Double.parseDouble(array[3]);

        if ((side1 <= 0) || (side2 <= 0) || (side3 <= 0)) throw new NumberFormatException();
        if (((side1 + side2) <= side3)
                || ((side1 + side3) <= side2)
                || ((side2 + side3) <= side1))
            throw new TriangleCreationException("triangle can't be created with these sides");

        Triangle triangle = new Triangle(name, side1, side2, side3);

        if (set.contains(triangle)) { System.out.println("this triangle already exists"); }
        else { set.add(triangle); }
    }
}

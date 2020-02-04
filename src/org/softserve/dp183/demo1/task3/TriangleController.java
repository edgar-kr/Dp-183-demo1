package org.softserve.dp183.demo1.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 04.02.2020.
 */
public class TriangleController {

    void work() {
        String[] strArray;

        TriangleValidator validator;
        TriangleFiller filler = new TriangleFiller();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            for (; ; ) {
                try {
                    System.out.println("Enter triangle name and 3 sides: ");
                    strArray = reader.readLine().split(",");

                    validator = new TriangleValidator(strArray);
                    validator.validateParams();

                    filler.addTriangles(strArray);
                } catch (TriangleCreationException | WrongParamsCountException e) {
                    System.out.println(e.getMessage());
                }
                System.out.print("Do you want to continue: ");
                if (!goOn(reader)) {
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("IO");
        }

        TrianglePrinter printer = new TrianglePrinter(filler.getSet());
        printer.print();
    }

    private boolean goOn(BufferedReader reader) throws IOException {
        String goOnMessage;
        goOnMessage = reader.readLine();

        if ((goOnMessage.equalsIgnoreCase("y") || goOnMessage.equalsIgnoreCase("yes"))) {
            return true;
        }
        return false;
    }
}

package org.softserve.dp183.demo1.task1;

/**
 * Created by User on 03.02.2020.
 */
public class TableController {

    public void work(String[] args) {
        try {
            TableValidator validator = new TableValidator();
            int[] params = validator.validateTwoNums(args);

            ChessTable table = new ChessTable(params[0], params[1]);

            TablePrinter printer = new TablePrinter(table);
            printer.printTable();
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            System.out.println("You must enter 2 natural numbers");
        }
    }
}

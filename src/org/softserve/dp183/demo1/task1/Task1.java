package org.softserve.dp183.demo1.task1;

/**
 * Created by User on 28.01.2020.
 */
public class Task1 {
    public static void main(String[] args) {
        try {
            int height = Integer.parseInt(args[0]);
            int length = Integer.parseInt(args[1]);

            if (height <= 0 || length <= 0) throw new NumberFormatException();

            ChessTable chessTable = new ChessTable(height, length);
            TableDrawer tableDrawer = new TableDrawer(chessTable);

            tableDrawer.drawTable();
        } catch (NumberFormatException e) {
            System.out.println("wrong parameters");
        }
    }
}

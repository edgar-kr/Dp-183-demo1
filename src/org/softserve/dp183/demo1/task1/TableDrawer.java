package org.softserve.dp183.demo1.task1;

/**
 * Created by User on 28.01.2020.
 */
public class TableDrawer {
    private ChessTable table;

    public TableDrawer(ChessTable table) {
        this.table = table;
    }

    public void drawTable() {
        for (int i = 0; i < table.getHeight(); i++) {
            if (i % 2 == 0) {
                System.out.println(evenLine());
            } else {
                System.out.println(unevenLine());
            }
        }
    }

    private String evenLine() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < table.getLength(); i++) {
            if (i % 2 == 0) {
                result.append(table.getBlackSpace());
            } else {
                result.append(table.getWhiteSpace());
            }
        }

        return result.toString();
    }

    private String unevenLine() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < table.getLength(); i++) {
            if (i % 2 == 0) {
                result.append(table.getWhiteSpace());
            } else {
                result.append(table.getBlackSpace());
            }
        }

        return result.toString();
    }
}

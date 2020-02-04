package org.softserve.dp183.demo1.task1;

/**
 * Created by User on 28.01.2020.
 */
public class TablePrinter {
    private ChessTable table;

    public TablePrinter(ChessTable table) {
        this.table = table;
    }

    public void printTable() {
        String result = getStrTable();
        System.out.println(result);
    }

    private String getStrTable() {
        StringBuilder result = new StringBuilder();
        String evenLine = horizontalLine(true);
        String unevenLine = horizontalLine(false);

        for (int i = 0; i < table.getHeight(); i++) {
            if (i % 2 == 0) {
                result.append(evenLine);
            } else {
                result.append(unevenLine);
            }
        }

        return result.toString();
    }

    private String horizontalLine(boolean isEven) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < table.getLength(); i++) {
            if (i % 2 == 0) {
                result.append(table.getBlackSpace());
            } else {
                result.append(table.getWhiteSpace());
            }
        }

        if (!isEven) {
            result.insert(0, table.getWhiteSpace());
            result.deleteCharAt(result.length() - 1);
        }
        result.append("\n");

        return result.toString();
    }

}

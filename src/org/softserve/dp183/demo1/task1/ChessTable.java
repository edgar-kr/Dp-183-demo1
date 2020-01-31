package org.softserve.dp183.demo1.task1;

/**
 * Created by User on 28.01.2020.
 */
public class ChessTable {
    private int height;
    private int length;
    private String blackSpace = "*";
    private String whiteSpace = " ";

    public ChessTable(int height, int length) {
        this.height = height;
        this.length = length;
    }

    public String getBlackSpace() {
        return blackSpace;
    }

    public String getWhiteSpace() {
        return whiteSpace;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }


}

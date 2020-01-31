package org.softserve.dp183.demo1.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 29.01.2020.
 */
public class StrCounter {
    private String path, matchStr;
    private int counter;

    public StrCounter(String path, String matchStr) {
        this.path = path;
        this.matchStr = matchStr;
    }

    public int getCounter() {
        return counter;
    }

    public void count() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String tempStr = reader.readLine();
    }
}

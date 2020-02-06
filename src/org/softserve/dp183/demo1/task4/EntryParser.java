package org.softserve.dp183.demo1.task4;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 03.02.2020.
 */
class EntryParser {
    private String parseStr;
    private File file;

    EntryParser(File file, String parseStr) {
        this.file = file;
        this.parseStr = parseStr;
    }

    private int getEntries() throws IOException {
        int entries = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.ready()) {
                String line = reader.readLine();

                Pattern pattern = Pattern.compile(parseStr);
                Matcher matcher = pattern.matcher(line);

                while (matcher.find()) {
                    entries++;
                }
            }
        }

        return entries;
    }

    void printEntries() throws IOException {
        System.out.printf("String \"%s\" was matched in file %d times", parseStr, getEntries());
    }
}
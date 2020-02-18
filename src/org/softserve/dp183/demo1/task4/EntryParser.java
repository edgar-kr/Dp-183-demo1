package org.softserve.dp183.demo1.task4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 03.02.2020.
 */
class EntryParser {
    private String parseStr;
    private Path path;

    EntryParser(Path path, String parseStr) {
        this.path = path;
        this.parseStr = parseStr;
    }

    public int getEntries() throws IOException {
        int entries = 0;

        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            String line = "";
            Pattern pattern = Pattern.compile(Pattern.quote(parseStr));

            while ((line = reader.readLine()) != null) {
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
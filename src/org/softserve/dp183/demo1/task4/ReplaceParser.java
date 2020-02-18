package org.softserve.dp183.demo1.task4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/**
 * Created by User on 03.02.2020.
 */
public class ReplaceParser {
    private Path path;
    private String oldStr;
    private String newStr;

    ReplaceParser(Path path, String oldStr, String newStr) {
        this.path = path;
        this.oldStr = oldStr;
        this.newStr = newStr;
    }


    public void parseFile() throws IOException {
        Path tempFile = Files.createTempFile(path.getParent(), "tempFile", ".tmp");

        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
             BufferedWriter writer = Files.newBufferedWriter(tempFile, StandardCharsets.UTF_8)) {

            String line = "";

            while ((line = reader.readLine()) != null) {
                writer.write(line.replace(oldStr, newStr));

                if (reader.ready()) {
                    writer.newLine();
                }
            }
        }

        Files.move(tempFile, path, StandardCopyOption.REPLACE_EXISTING);

        System.out.println("File was parsed");
    }

}

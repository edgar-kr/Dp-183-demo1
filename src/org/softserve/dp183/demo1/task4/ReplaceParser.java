package org.softserve.dp183.demo1.task4;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by User on 03.02.2020.
 */
public class ReplaceParser {
    private File file;
    private String oldStr;
    private String newStr;
    private ArrayList<String> fileList;

    ReplaceParser(File file, String oldStr, String newStr) {
        this.file = file;
        this.oldStr = oldStr;
        this.newStr = newStr;
        fileList = new ArrayList<>();
    }

    void parseFile() throws IOException {
        readFile();
        writeFile();
        System.out.println("File was parsed");
    }

    private void readFile() throws IOException {
        String str = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.ready()) {
                str = reader.readLine();
                fileList.add(str.replace(oldStr, newStr));
            }
        }
    }

    private void writeFile() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String str : fileList) {
                writer.write(str);
                writer.newLine();
            }
        }
    }
}

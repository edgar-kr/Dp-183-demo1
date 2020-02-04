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

    void parseFile() {
        readFile();
        writeFile();
        System.out.println("File was parsed");
    }

    private void readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String str = "";

            while (reader.ready()) {
                str = reader.readLine();
                fileList.add(str.replace(oldStr, newStr));
            }
        } catch (IOException e) {
            System.out.println("Wrong file path");
        }
    }

    private void writeFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String str : fileList) {
                writer.write(str);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Wrong file path");
        }
    }
}

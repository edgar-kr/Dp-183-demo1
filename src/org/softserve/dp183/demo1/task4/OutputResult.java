package org.softserve.dp183.demo1.task4;

/**
 * Created by User on 18.02.2020.
 */
public class OutputResult {

    public static void printEntryParserResult(String parseStr, int count) {
        System.out.printf("String \"%s\" was matched in file %d times", parseStr, count);
    }

    public static void printIfSuccess(){
        System.out.println("File was parsed");
    }

}

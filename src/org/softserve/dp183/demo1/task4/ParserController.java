package org.softserve.dp183.demo1.task4;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by User on 03.02.2020.
 */
public class ParserController {

    void work(String[] args) {
        try {
            DataValidator validator = new DataValidator(args);
            validator.validateData();

            File file = new File(args[0]);

            if (args.length == 2) {
                EntryParser entryParser = new EntryParser(file, args[1]);
                entryParser.printEntries();
            } else {
                ReplaceParser replaceParser = new ReplaceParser(file, args[1], args[2]);
                replaceParser.parseFile();
            }
        } catch (NotEnoughParamsException e) {
            System.out.println("Not enough params");
        } catch (FileNotFoundException e) {
            System.out.println("Wrong file path");
        }
    }
}

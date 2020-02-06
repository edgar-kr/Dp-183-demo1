package org.softserve.dp183.demo1.task4;

import java.io.File;
import java.io.IOException;

/**
 * Created by User on 03.02.2020.
 */
public class ParserController {

    void work(String[] args) {
        DataValidator validator = new DataValidator(args);

        try {
            validator.validateCount();

            File file = validator.validateFile();

            if (args.length == 2) {
                EntryParser entryParser = new EntryParser(file, args[1]);
                entryParser.printEntries();
            } else {
                ReplaceParser replaceParser = new ReplaceParser(file, args[1], args[2]);
                replaceParser.parseFile();
            }
        } catch (NotEnoughParamsException | FileDoesNotExistException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

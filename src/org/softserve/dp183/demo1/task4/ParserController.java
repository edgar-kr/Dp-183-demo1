package org.softserve.dp183.demo1.task4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by User on 03.02.2020.
 */
public class ParserController {

    void work(String[] args) {

        try {
            if (DataValidator.validateCount(args) && DataValidator.validateFile(args)) {
                Path file = Paths.get(args[0]);

                if (args.length == 2) {
                    EntryParser entryParser = new EntryParser(file, args[1]);
                    entryParser.printEntries();
                } else {
                    ReplaceParser replaceParser = new ReplaceParser(file, args[1], args[2]);
                    replaceParser.parseFile();
                }
            }
        } catch (NotEnoughParamsException | FileDoesNotExistException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

package org.softserve.dp183.demo1.task4;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by User on 03.02.2020.
 */
public class ParserController {

    void work(String[] args) {

        try {
            if (DataValidator.validateCount(args) && DataValidator.validateFile(new File(args[0]))) {
                Path path = Paths.get(args[0]);

                if (args.length == 2) {
                    EntryFileParser entryFileParser = new EntryFileParser(path, args[1]);
                    OutputResult.printEntryParserResult(args[1], entryFileParser.getEntries());
                } else {
                    ReplaceFileParser replaceFileParser = new ReplaceFileParser(path, args[1], args[2]);
                    if (replaceFileParser.parseFile()) {
                        OutputResult.printIfSuccess();
                    }
                }
            }
        } catch (NotEnoughParamsException | FileDoesNotExistException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

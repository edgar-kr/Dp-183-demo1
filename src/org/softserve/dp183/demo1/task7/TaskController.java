package org.softserve.dp183.demo1.task7;

/**
 * Created by User on 02.02.2020.
 */
class TaskController {
    private String[] args;

    TaskController(String[] args) {
        this.args = args;
    }

    void work() {
        try {
            ParamValidator validator = new ParamValidator(args);
            int param = validator.validateParam();

            NumSequence numSequence = new NumSequence(param);

            PrintSequence printSequence = new PrintSequence(numSequence);
            printSequence.print();
        } catch (WrongParameterException | NumberFormatException e) {
            System.out.println("Parameter must be number >0");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No parameters");
        }
    }
}

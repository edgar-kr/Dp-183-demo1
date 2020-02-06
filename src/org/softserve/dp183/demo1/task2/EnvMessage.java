package org.softserve.dp183.demo1.task2;

/**
 * Created by User on 02.02.2020.
 */
class EnvMessage {
    private static int envCount = 1;
    private static int sideCount = 1;

    static void incrementSideCount() {
        sideCount++;
    }

    static void askSide() {
        System.out.printf("side%d = ", sideCount);
    }

    static void askEnvelope() {
        System.out.printf("Enter %s envelope sides:%n", envCount);
        envCount++;
        sideCount = 1;
    }

    static void askOnceMore() {
        envCount = 1;
        sideCount = 1;
        System.out.print("Do you want to continue: ");
    }

    static void printResult(boolean canFit) {
        String result = canFit ? "can" : "can't";
        System.out.printf("Envelope1 %s fit envelope2%n%n", result);
    }
}

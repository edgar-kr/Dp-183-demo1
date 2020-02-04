package org.softserve.dp183.demo1.task2;

/**
 * Created by User on 02.02.2020.
 */
public class EnvMessage {
    private static int envCount = 1;
    private static int sideCount = 1;

    public static void incrementSideCount(){
        sideCount++;
    }

    public static void askSide() {
        System.out.printf("side%d = ", sideCount);
    }

    public static void askEnvelope() {
        System.out.printf("Enter %s envelope sides:%n", envCount);
        envCount++;
        sideCount = 1;
    }

    public static void askOnceMore() {
        envCount = 1;
        sideCount = 1;
        System.out.print("Do you want to continue: ");
    }

    public static void printResult(boolean canFit) {
        String result = canFit ? "can" : "can't";
        System.out.printf("Envelopes %s fit each other%n%n", result);
    }
}

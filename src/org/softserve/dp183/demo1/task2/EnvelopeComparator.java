package org.softserve.dp183.demo1.task2;

/**
 * Created by User on 28.01.2020.
 */
public class EnvelopeComparator {
    private Envelope env1;
    private Envelope env2;

    public EnvelopeComparator(Envelope env1, Envelope env2) {
        this.env1 = env1;
        this.env2 = env2;
    }

    private void switchSides(Envelope env) {
        if (env.getSide1() > env.getSide2()) {
            double temp = env.getSide1();
            env.setSide1(env.getSide2());
            env.setSide2(temp);
        }
    }

    private boolean compare() {
        switchSides(env1);
        switchSides(env2);

        if (env1.getSide1() <= env2.getSide1() &&
                env1.getSide2() <= env2.getSide2())
            return true;
        else return false;
    }

    public void envCompare() {
        String canFit = compare() ? "can" : "can't";
        System.out.printf("Envelope1 %s fit Envelope2", canFit);
    }
}

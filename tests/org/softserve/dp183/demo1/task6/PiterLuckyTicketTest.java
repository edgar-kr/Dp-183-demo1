package org.softserve.dp183.demo1.task6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by User on 19.02.2020.
 */
@RunWith(Parameterized.class)
public class PiterLuckyTicketTest {
    private int inputTicket;
    private boolean expected;
    private PiterLuckyTicket luckyTicket;

    public PiterLuckyTicketTest(int value, boolean expected) {
        this.inputTicket = value;
        this.expected = expected;
    }

    @Before
    public void setUp() throws Exception {
        luckyTicket = new PiterLuckyTicket();
    }

    @After
    public void tearDown() throws Exception {
        luckyTicket = null;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {124300, true},
                {11, true},
                {53020, true},
                {111111, true},
                {111, false},
                {123456, false},
                {4200, false}
        });
    }

    @Test
    public void testIsLucky() throws Exception {
        assertEquals(expected, luckyTicket.isLucky(inputTicket));
    }

    @Test
    public void testToString() throws Exception {
        String expectedStr = "PiterLuckyTicket";

        assertEquals(expectedStr, luckyTicket.toString());
    }
}


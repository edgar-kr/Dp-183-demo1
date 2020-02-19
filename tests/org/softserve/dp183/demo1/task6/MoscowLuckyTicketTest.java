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
 * Created by User on 18.02.2020.
 */
@RunWith(Parameterized.class)
public class MoscowLuckyTicketTest {

    private int inputTicket;
    private boolean expected;
    private MoscowLuckyTicket luckyTicket;

    public MoscowLuckyTicketTest(int value, boolean expected) {
        this.inputTicket = value;
        this.expected = expected;
    }

    @Before
    public void setUp() throws Exception {
        luckyTicket = new MoscowLuckyTicket();
    }

    @After
    public void tearDown() throws Exception {
        luckyTicket = null;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {123123, true},
                {3111, true},
                {1001, true},
                {456915, true},
                {111, false},
                {525252, false},
                {411441, false}
        });
    }

    @Test
    public void testIsLucky() throws Exception {
        assertEquals(expected, luckyTicket.isLucky(inputTicket));
    }


    @Test
    public void testToString() throws Exception {
        String expectedStr = "MoscowLuckyTicket";

        assertEquals(expectedStr, luckyTicket.toString());
    }

}

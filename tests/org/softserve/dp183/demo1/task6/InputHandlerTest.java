package org.softserve.dp183.demo1.task6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by User on 19.02.2020.
 */
@RunWith(Parameterized.class)
public class InputHandlerTest {
    private String input;
    private int[] expected;
    private InputStream inputStream;

    public InputHandlerTest(String input, int[] expected) {
        this.input = input;
        this.expected = expected;
    }

    @Before
    public void setUp() throws Exception {
        inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
    }

    @After
    public void tearDown() throws Exception {
        inputStream = null;
        System.setIn(System.in);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"1 25", new int[]{1, 25}},
                {"100 5", new int[]{5, 100}},
                {"  15  10000", new int[]{15, 10000}},
                {"555,  25555", new int[]{555, 25555}},
                {" 125   555   ", new int[]{125, 555}},
                {"0,999999", new int[]{0, 999999}},
        });

    }

    @Test
    public void testGetInterval() throws Exception {
        assertArrayEquals(expected, InputHandler.getInterval());
    }
}
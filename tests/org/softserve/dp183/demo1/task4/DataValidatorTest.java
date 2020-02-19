package org.softserve.dp183.demo1.task4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;

/**
 * Created by User on 19.02.2020.
 */
@RunWith(MockitoJUnitRunner.class)
public class DataValidatorTest {

    @Test(expected = NotEnoughParamsException.class)
    public void testValidateCountExcThrown() throws Exception {
        DataValidator.validateCount(new String[]{"c:\test.txt"});
    }

    @Test
    public void testValidateCountSuccess() throws Exception {
        assertTrue(DataValidator.validateCount(new String[]{"c:\test.txt", "abc"}));
    }

    @Test(expected = FileDoesNotExistException.class)
    public void testValidateFileExcThrown() throws Exception {
        File file = Mockito.mock(File.class);

        Mockito.when(file.exists()).thenReturn(false);

        DataValidator.validateFile(file);
    }

    @Test
    public void testValidateFileSuccess() throws Exception {
        File file = Mockito.mock(File.class);

        Mockito.when(file.exists()).thenReturn(true);

        assertTrue(DataValidator.validateFile(file));
    }


}
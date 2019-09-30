package by.bsuir.devteam.utils;

import org.junit.Test;
import org.junit.Assert;


public class DataValidatorTest {

    @Test
    public void checkWord() {

        String word = "Daniil";

        boolean expected = DataValidator.checkWord(word);

        Assert.assertTrue(expected);
    }

    @Test
    public void checkPhoneNumber() {
        String number = "1225811";

        boolean expected = DataValidator.checkPhoneNumber(number);

        Assert.assertTrue(expected);
    }
}
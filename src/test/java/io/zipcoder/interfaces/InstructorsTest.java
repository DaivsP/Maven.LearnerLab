package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {
    @Test
    public void instructorsTest(){
        Instructors instructors = Instructors.getInstance();
        Integer acutal = instructors.getSize();

        Integer expected = 5;
        Assert.assertEquals(expected, acutal);
    }
}
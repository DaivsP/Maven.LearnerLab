package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentsTest {
    @Test
    public void StudentsTest(){
        Students students = Students.getInstance();
        Integer expected = 40;

        Integer actual = students.getSize();

        Assert.assertEquals(expected, actual);
    }
}
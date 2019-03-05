package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void constructorTest(){
        //Given
        Person person = new Person(15);

        //When
        Long actual = person.getId();

        //Then
        Long expected = (long)15;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        //Given
        Person person = new Person(15);
        person.setName("Davis");

        //When
        String actual = person.getName();

        //Then
        String expected = "Davis";
        Assert.assertEquals(expected, actual);
    }

}

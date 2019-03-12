package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PeopleTest {

    @Test
    public void testAdd(){
        //Given
        People people = new People();

        //When
        people.add(new Person(10));
        Integer actual = people.getCount();

        //Then
        Integer expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemove(){
        //Given
        People people = new People();
        Person person = new Person(10);

        //When
        people.add(person);
        Integer beforeRemove = people.getCount();

        people.remove(person);
        Integer afterRemove = people.getCount();

        //Then
        Integer expectedAfterRemove = 0;
        Assert.assertNotEquals(beforeRemove, afterRemove);
        Assert.assertEquals(afterRemove, expectedAfterRemove);
    }

    @Test
    public void testRemoveById(){
        //Given
        People people = new People();
        Person person = new Person(10);

        //When
        people.add(person);
        Integer beforeRemove = people.getCount();

        people.remove(10);
        Integer afterRemove = people.getCount();

        //Then
        Integer expectedAfterRemove = 0;
        Assert.assertNotEquals(beforeRemove, afterRemove);
        Assert.assertEquals(expectedAfterRemove, afterRemove);
    }

    @Test
    public void testFindById(){
        //Given
        People people = new People();
        Person person1 = new Person(20);
        Person person2 = new Person(21);
        people.add(person1);
        people.add(person2);

        //When
        Person personActual = people.getById(20);

        //Then
        Person expected = person1;
        Assert.assertEquals(expected, personActual);
    }
}
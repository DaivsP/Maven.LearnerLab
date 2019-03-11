package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void learnTest() {
        //Given
        Student student = new Student(10);

        //When
        student.learn(10);
        double actual = student.getTotalStudyTime();

        //Then
        double expected = 10;
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testImplementation(){
        //Given
        Student student = new Student(10);

        //Then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        //Given
        Student student = new Student(10);

        //Then
        Assert.assertTrue(student instanceof Person);
    }
}
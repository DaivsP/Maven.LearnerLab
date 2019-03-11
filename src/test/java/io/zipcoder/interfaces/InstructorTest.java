package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {

    private Object Learner;

    @Test
    public void teachTest() {
        //Given
        Instructor instructor = new Instructor(20);
        Student student = new Student(25);

        //When
        instructor.teach(student, 8);
        double actual = student.getTotalStudyTime();

        //Then
        double expected = 8;
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void lectureTest() {
        //Given
        Instructor instructor = new Instructor(20);
        Student student1 = new Student(25);
        Student student2 = new Student(26);
        Learner[] learners = new Learner[]{student1, student2};

        //When
        instructor.lecture(learners, 8);
        double actual1 = student1.getTotalStudyTime();
        double actual2 = student2.getTotalStudyTime();

        //Then
        double expected1 = 4;
        double expected2 = 4;
        Assert.assertEquals(expected1, actual1, 1);
        Assert.assertEquals(expected2, actual2, 1);
    }

    @Test
    public void testImplementation(){
        //Given
        Instructor instructor = new Instructor(20);

        //Then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        //Given
        Instructor instructor = new Instructor(20);

        //Then
        Assert.assertTrue(instructor instanceof Person);
    }
}
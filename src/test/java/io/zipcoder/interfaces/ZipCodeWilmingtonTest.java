package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLecture() {
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        zipCodeWilmington.hostLecture(new Instructor(10), 40);

        double actual = zipCodeWilmington.students.studentsList.get(0).getTotalStudyTime();

        double expected = 1;
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void hostLecture1() {
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        zipCodeWilmington.hostLecture(2, 40);

        double actual = zipCodeWilmington.students.studentsList.get(0).getTotalStudyTime();

        double expected = 1;
        Assert.assertEquals(expected, actual, 1);
    }
}
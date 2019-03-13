package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;
import sun.security.x509.EDIPartyName;

import static org.junit.Assert.*;

public class EducatorTest {

    @Test
    public void teachTest() {
        Educator educator = Educator.DOLIO;
        educator.teach(Students.getInstance().getById(1), 10);

        double actual = Students.getInstance().getById(1).getTotalStudyTime();

        double expected = 10;

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void lectureTest() {
        Educator educator = Educator.DOLIO;
        educator.lecture(Students.getInstance().studentsList.toArray(new Learner[0]), 40);

        double actual = Students.getInstance().getById(1).getTotalStudyTime();

        double expected = 1;

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testImplementation(){
        Educator educator = Educator.DOLIO;

        Assert.assertTrue(educator instanceof Teacher);
    }
}
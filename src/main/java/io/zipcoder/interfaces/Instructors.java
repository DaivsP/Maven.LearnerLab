package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Instructors {
    List<Instructor> instructorList;
    private final static Instructors Instance = new Instructors();

    public static Instructors getInstance() {
        return Instance;
    }

    private Instructors() {
        instructorList = new ArrayList<Instructor>();
        for (Long i = 1L; i <= 5; i++) {
            instructorList.add(new Instructor(i));
        }
    }

    public Integer getSize() {
        return instructorList.size();
    }
}

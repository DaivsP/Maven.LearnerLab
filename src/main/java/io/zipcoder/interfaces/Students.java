package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

class Students extends People<Student>{
    List<Student> studentsList;
    private final static Students Instance = new Students();

    private Students() {
        studentsList = new ArrayList<Student>();
        for (Long i = 1L; i <= 40; i++) {
            studentsList.add(new Student(i));
        }
    }

    public Student[] getArray() {
        return new Student[0];
    }

    public static Students getInstance() {
        return Instance;
    }

    public Integer getSize() {
        return studentsList.size();
    }
}

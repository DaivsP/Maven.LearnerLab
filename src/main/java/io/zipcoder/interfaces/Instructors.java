package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Instructors extends People<Instructor>{
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

    public Person getById(long id) {
        Person returnPerson = null;
        for (Person person : instructorList) {
            if (person.getId() == id){
                returnPerson = person;
            }
        }
        return returnPerson;
    }

    public Instructor[] getArray() {
        return new Instructor[0];
    }

    public Integer getSize() {
        return instructorList.size();
    }
}

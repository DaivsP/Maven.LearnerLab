package io.zipcoder.interfaces;

public class ZipCodeWilmington {
    Students students;
    Instructors instructors;
    private static ZipCodeWilmington ourInstance = new ZipCodeWilmington();

    public static ZipCodeWilmington getInstance() {
        return ourInstance;
    }

    private ZipCodeWilmington() {
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.personList, 8);
    }
}

package io.zipcoder.interfaces;

public class ZipCodeWilmington {
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();
    private static ZipCodeWilmington Instance = new ZipCodeWilmington();

    public static ZipCodeWilmington getInstance() {
        return Instance;
    }

    private ZipCodeWilmington() {
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.studentsList.toArray(new Learner[0]), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Instructor instructor= (Instructor) instructors.getById(id);
        instructor.lecture(students.studentsList.toArray(new Learner[students.studentsList.size()]), numberOfHours);
    }
}

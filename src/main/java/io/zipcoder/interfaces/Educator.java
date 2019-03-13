package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    LEON,
    WILHEM,
    FROILAN,
    KRIS,
    NHU,
    DOLIO;

    private final Instructor instructor;


    Educator() {
        this.instructor = new Instructor(ordinal()) {
            private Integer numberOfHoursWorked;

            @Override
            public void teach(Learner learner, double numberOfHours) {
                learner.learn(numberOfHours);
                numberOfHoursWorked++;
            }
        };
        Instructors.getInstance().add(instructor);
    }

    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
    }
}
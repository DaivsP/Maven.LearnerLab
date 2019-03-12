package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class People {
    List<Person> personList;

    public People(){
        this.personList = new ArrayList<Person>();
    }

    public void add(Person person) {
        personList.add(person);
    }

    public Integer getCount() {
        return personList.size();
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public Person getById(long id) {
        Person returnPerson = null;
        for (Person person : personList) {
            if (person.getId() == id){
                returnPerson = person;
            }
        }
        return returnPerson;
    }

    public void remove(long id){
        for (Person person : personList) {
            if (person.getId() == id){
                personList.remove(person);
                break;
            }
        }
    }

    public Person[] getArray(){
        return personList.toArray(new Person[0]);
    }

    public void removeAll(){
        personList.clear();
    }
}

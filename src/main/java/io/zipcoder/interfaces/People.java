package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public abstract class People<E extends Person> {
    List<E> personList;

    public People(){
        this.personList = new ArrayList<E>();
    }

    public void add(E person) {
        personList.add(person);
    }

    public Integer getCount() {
        return personList.size();
    }

    public void remove(E person) {
        personList.remove(person);
    }

    public Person getById(long id) {
        E returnPerson = null;
        for (E person : personList) {
            if (person.getId() == id){
                returnPerson = person;
            }
        }
        return returnPerson;
    }

    public void remove(long id){
        for (E person : personList) {
            if (person.getId() == id){
                personList.remove(person);
                break;
            }
        }
    }

    public abstract E[] getArray();

    public void removeAll(){
        personList.clear();
    }
}

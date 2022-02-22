package com.company;

import java.util.Arrays;

public class Pool {

   private AbstractPerson[] people;

   public Pool() {

   }

    public Pool(AbstractPerson[] people) {
        this.people = people;
    }

    public AbstractPerson[] getPeople() {
        return people;
    }

    public void setPeople(AbstractPerson[] people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Pool{" + "people=" + Arrays.toString(people) + '}';
    }
}

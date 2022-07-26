package com.company;

import java.util.Arrays;

public abstract class Family implements Toloit  {
 private Person[] person;

    public Family(Person[] person) {
        this.person = person;

    }

    public Person[] getPerson() {
        return person;
    }

    public void setPerson(Person[] person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Family\n" + Arrays.toString(person);
    }


    }




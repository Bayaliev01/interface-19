package com.company;

public class Flat extends Family implements Toloit {


    public Flat(Person[] people) {
        super(people);
    }

    @Override
    public void toloit() {
        System.out.println("ком-услуга за Квартиру");
    }
}

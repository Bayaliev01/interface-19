package com.company;

public class Dormitory extends Family implements Toloit {


    public Dormitory(Person[] people) {
        super(people);
    }

    @Override
    public void toloit() {
        System.out.println("Аренда за общягу");
    }
}

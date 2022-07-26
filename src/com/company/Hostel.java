package com.company;

public class Hostel extends Family implements Toloit{
    public Hostel(Person[] person) {
        super(person);
    }

    @Override
    public void toloit() {
        System.out.println("оплачивает за аренду");
        System.out.println("\n-----------------------");

    }

    @Override
    public void adress() {
        System.out.println("проживает по адрессу г.Бишкек ул Манасов дом 187");
    }

    @Override
    public void kolichestvo() {
        System.out.println("живут в общежитие кол-во человек 2");

    }
}

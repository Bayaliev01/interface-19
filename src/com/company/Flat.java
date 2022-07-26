package com.company;

public class Flat extends Family implements Toloit {
    public Flat(Person[] person) {
        super(person);
    }

    @Override
    public void toloit() {
        System.out.println("оплачивает за ком-услугу");
        System.out.println("\n-----------------------");
    }

    @Override
    public void adress() {
        System.out.println(" Проживает по адрессу г.Москва.ул Московская дом 78");
    }

    @Override
    public void kolichestvo() {
        System.out.println("Живут в квартире кол-во человек  4 ");
    }

}

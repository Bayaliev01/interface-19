package com.company;

public class Hotel extends Family implements Toloit{
    public Hotel(Person[] person) {
        super(person);
    }

    @Override
    public void toloit() {
        System.out.println("оплачивает за Аренду");
        System.out.println("\n-----------------------");

    }

    @Override
    public void adress() {
        System.out.println("проживает по адрессу г.Сочи ул Ленинский проспект дои 36");
    }

    @Override
    public void kolichestvo() {
        System.out.println("Снимает гостиницу кол-во человек  2");
    }


}

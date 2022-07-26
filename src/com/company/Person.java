package com.company;

import java.util.Arrays;

public  class Person {
private String name;
private int age;




    public Person(String name , int age) {
        this.name = name;
this.age=age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getAdress() {
        return name;
    }

    public void setAdress(String adress) {
        this.name = adress;
    }

    @Override
    public String toString() {
        return  " Имя - " + name + "   Возраст - " +age+"\n";

    }

}


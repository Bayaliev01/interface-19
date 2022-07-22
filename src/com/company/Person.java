package com.company;

import java.util.Arrays;

public  class Person implements Toloit{
private String adress;
private int piople;

    public Person(String adress, int piople) {
        this.adress = adress;
        this.piople = piople;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPiople() {
        return piople;
    }

    public void setPiople(int piople) {
        this.piople = piople;
    }

    @Override
    public void toloit() {

    }

    @Override
    public void jashait() {

    }

    @Override
    public String toString() {
        return
                "Адрес проживания -  " + adress +
                "\nКоличество людей - " + piople;
    }
}


package com.company;

public class Family2 extends Person {


    public Family2(String adress, int piople) {
        super(adress, piople);
    }

    @Override
    public void toloit() {
        System.out.println("платят за аренду ");
    }

    @Override
    public void jashait() {
        System.out.println("снимает гостиницу");
        System.out.println("------------------");
    }
}

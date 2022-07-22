package com.company;

public class Family3 extends Person{


    public Family3(String adress, int piople) {
        super(adress, piople);
    }

    @Override
    public void toloit() {
        System.out.println("платят за аренду");
    }

    @Override
    public void jashait() {
        System.out.println("живут в общежитие");
        System.out.println("------------------");
    }
}

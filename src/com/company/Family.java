package com.company;

import java.util.Arrays;

public class Family extends Person  {


    public Family(String adress, int piople) {
        super(adress, piople);
    }

    @Override
    public void toloit() {
        System.out.println("платят за ком-услуги");
    }

    @Override
    public void jashait() {
        System.out.println("живут в квартире");
        System.out.println("------------------");
    }
}

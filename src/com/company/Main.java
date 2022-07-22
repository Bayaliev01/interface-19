package com.company;

public class Main {
    public static void main(String[] args) {
Family family = new Family("Москва",4);
        System.out.println(family);
family.toloit();
family.jashait();
        Family2 family2 = new Family2("Дубай",2);
        System.out.println(family2);
        family2.toloit();
        family2.jashait();
        Family3 family3 = new Family3("Бишкеке",2);
        System.out.println(family3);
        family3.toloit();
        family3.jashait();

    }
}
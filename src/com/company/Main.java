package com.company;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Влад", 31);
        Person person1 = new Person("Аелита", 27);
        Person person2 = new Person("Анастасия", 9);
        Person person3 = new Person("Александр", 5);
        Person person4 = new Person("Ислам", 21);
        Person person7 = new Person("Мура", 21);
        Person person5 = new Person("Анжелика", 22);
        Person person6 = new Person("Николай", 24);

        Family family = new Flat(new Person[]{person, person1, person2, person3});
        Family family2 = new Hostel(new Person[]{person4, person7});
        Family family3 = new Hotel(new Person[]{person5, person6});
        System.out.println(family);
        family.adress();
        family.kolichestvo();
        family.toloit();
        System.out.println(family2);
        family2.adress();
        family2.kolichestvo();
        family2.toloit();
        System.out.println(family3);
        family3.adress();
        family3.kolichestvo();
        family3.toloit();
    }
}
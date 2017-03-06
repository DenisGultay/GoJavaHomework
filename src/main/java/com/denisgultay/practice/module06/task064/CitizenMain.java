package com.denisgultay.practice.module06.task064;

public class CitizenMain {

    public static void main(String[] args) {

        Citizen eng = CitizenFactory.englishman();
        Citizen chi = CitizenFactory.chinese();
        Citizen rus = CitizenFactory.russian();
        Citizen ita = CitizenFactory.italian();


        System.out.println(eng.sayHello());
        System.out.println(chi.sayHello());
        System.out.println(rus.sayHello());
        System.out.println(ita.sayHello());


    }
}

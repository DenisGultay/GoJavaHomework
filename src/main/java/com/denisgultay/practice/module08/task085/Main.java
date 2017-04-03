package com.denisgultay.practice.module08.task085;

import com.denisgultay.practice.module08.task081.Country;
import com.denisgultay.practice.module08.task081.IdGenerator;
import com.denisgultay.practice.module08.task082.Food;

public class Main {

    public static void main(String[] args) {

        Food bananas = new Food(IdGenerator.createId(), "bananas", Country.EQUADOR, 14);

        System.out.println(bananas);

        Food apples = new Food(IdGenerator.createId(), "apples", Country.POLAND, 30);
        System.out.println(apples);
        System.out.println(apples.getId());
        Food chees = new Food(IdGenerator.createId(), "chees", Country.NETHERLANDS, 60);
        System.out.println(chees);
    }
}

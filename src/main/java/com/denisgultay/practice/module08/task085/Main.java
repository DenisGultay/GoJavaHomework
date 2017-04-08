package com.denisgultay.practice.module08.task085;

import com.denisgultay.practice.module08.task081.Country;
import com.denisgultay.practice.module08.task081.IdGenerator;
import com.denisgultay.practice.module08.task082.Food;
import com.denisgultay.practice.module08.task084.FoodDataBase;

import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Food bananas = new Food(IdGenerator.createId(), "bananas", Country.EQUADOR, 14);
        Food apples = new Food(IdGenerator.createId(), "apples", Country.POLAND, 30);
        Food chees = new Food(IdGenerator.createId(), "chees", Country.NETHERLANDS, 60);
        Food potatoes = new Food(IdGenerator.createId(), "potatoes", Country.UKRAINE, 90);
        Food coffee = new Food(IdGenerator.createId(), "coffee", Country.BRAZIL, 360);
        Food tea = new Food(IdGenerator.createId(), "tea", Country.ENGLAND, 360);
        Food rice = new Food(IdGenerator.createId(), "rice", Country.CHINA, 240);
        Food oil = new Food(IdGenerator.createId(), "oil", Country.UKRAINE, 120);
        Food strawberry = new Food(IdGenerator.createId(), "strawberry", Country.POLAND, 30);


        FoodDataBase foodDataBase = new FoodDataBase();
        foodDataBase.save(potatoes, 20.25);
        foodDataBase.save(chees, 59.60);
        foodDataBase.save(apples, 15.36);
        foodDataBase.save(bananas, 18.00);
        foodDataBase.save(coffee, 105.50);
        foodDataBase.save(oil, 35.70);
        foodDataBase.save(rice, 18.00);
        foodDataBase.save(strawberry, 55.36);
        foodDataBase.save(tea);

        System.out.println(foodDataBase.getProducts());
        System.out.println(foodDataBase.getPrices());
        foodDataBase.delete(rice);
        foodDataBase.delete(tea);
        System.out.println(foodDataBase.getProducts());

    }
}

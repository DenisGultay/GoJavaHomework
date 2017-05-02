package com.denisgultay.practice.module08.task085;

import com.denisgultay.practice.module08.task081.Country;
import com.denisgultay.practice.module08.task081.IdGenerator;
import com.denisgultay.practice.module08.task082.Food;
import com.denisgultay.practice.module08.task084.FoodDataBase;

import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Food bananas = new Food("bananas", Country.EQUADOR, 14);
        Food apples = new Food("apples", Country.POLAND, 30);
        Food chees = new Food("chees", Country.NETHERLANDS, 60);
        Food potatoes = new Food("potatoes", Country.UKRAINE, 90);
        Food coffee = new Food("coffee", Country.BRAZIL, 360);
        Food tea = new Food("tea", Country.ENGLAND, 360);
        Food rice = new Food("rice", Country.CHINA, 240);
        Food oil = new Food("oil", Country.UKRAINE, 120);
        Food strawberry = new Food("strawberry", Country.POLAND, 30);


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
//        System.out.println(foodDataBase.getPrices());
//        foodDataBase.delete(rice);
//        foodDataBase.delete(tea);
//        foodDataBase.deleteById(26551406);
//        System.out.println(foodDataBase.getProducts());
//        System.out.println(foodDataBase.get(5));
//        System.out.println(foodDataBase.getPrice(strawberry));

    }

}

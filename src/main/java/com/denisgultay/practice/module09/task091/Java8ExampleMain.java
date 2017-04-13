package com.denisgultay.practice.module09.task091;

import com.denisgultay.practice.module04.task042.Currency;
import com.denisgultay.practice.module07.task071.Order;
import com.denisgultay.practice.module07.task071.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Java8ExampleMain {

    public static void main(String[] args) {

        User Antonov = new User(11L, "Anton", "Antonov", "Kyiv", 5000);
        User Denisov = new User(22L, "Denis", "Denisov", "Lviv", 5500);
        User Danilov = new User(33L, "Danil", "Danilov", "Dnipro", 6000);
        User Borisov = new User(44L, "Boris", "Borisov", "Kyiv", 7000);
        User Petrov = new User(55L, "Petro", "Petrov", "Lviv", 5000);
        User Kirilov = new User(66L, "Kiril", "Kirilov", "Kyiv", 6500);
        User Pavlov = new User(77L, "Pavlo", "Pavlov", "Poltava", 4000);
        User Viktorov = new User(88L, "Viktor", "Viktorov", "Rivne", 7000);
        User Myhailov = new User(99L, "Myhailo", "Myhailov", "Kyiv", 5500);
        User Bohdanov = new User(111L, "Bohdan", "Bohdanov", "Lviv", 5000);


        List<Order> orderList = new ArrayList<Order>();
        orderList.add(new Order(101L, 10, Currency.USD, "Insomnia", "KSD", Bohdanov));
        orderList.add(new Order(102L, 20, Currency.EUR, "Christine", "ABG", Antonov));
        orderList.add(new Order(103L, 40, Currency.UAH, "Misery", "KSD", Viktorov));
        orderList.add(new Order(104L, 20, Currency.USD, "Green Mile", "FOL", Danilov));
        orderList.add(new Order(105L, 40, Currency.UAH, "Dreamcatcher", "KSD", Pavlov));
        orderList.add(new Order(106L, 10, Currency.EUR, "Revival", "ABG", Borisov));
        orderList.add(new Order(107L, 50, Currency.UAH, "Green Mile", "FOL", Myhailov));
        orderList.add(new Order(108L, 50, Currency.UAH, "Desperation", "KSD", Denisov));
        orderList.add(new Order(109L, 10, Currency.USD, "Insomnia", "KSD", Petrov));
        orderList.add(new Order(110L, 30, Currency.UAH, "It", "AST", Kirilov));



    }
}

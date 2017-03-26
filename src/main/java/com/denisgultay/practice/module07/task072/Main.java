package com.denisgultay.practice.module07.task072;

import com.denisgultay.practice.module04.task042.Currency;
import com.denisgultay.practice.module07.task071.Order;
import com.denisgultay.practice.module07.task071.User;
import java.util.Set;
import java.util.TreeSet;

import java.util.*;

public class Main {

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

    Order order1 = new Order(101L, 10, Currency.USD, "Insomnia", "KSD", Bohdanov);
    Order order2 = new Order(102L, 20, Currency.EUR, "Christine", "ABG", Antonov);
    Order order3 = new Order(103L, 40, Currency.UAH, "Misery", "KSD", Viktorov);
    Order order4 = new Order(104L, 20, Currency.USD, "Green Mile", "FOL", Danilov);
    Order order5 = new Order(105L, 40, Currency.UAH, "Dreamcatcher", "KSD", Pavlov);
    Order order6 = new Order(106L, 10, Currency.EUR, "Revival", "ABG", Borisov);
    Order order7 = new Order(107L, 50, Currency.UAH, "Green Mile", "FOL", Myhailov);
    Order order8 = new Order(108L, 50, Currency.UAH, "Desperation", "KSD", Denisov);
    Order order9 = new Order(109L, 10, Currency.USD, "Insomnia", "KSD", Petrov);
    Order order10 = new Order(110L, 30, Currency.UAH, "It", "AST", Kirilov);
    Order order11 = new Order(102L, 20, Currency.EUR, "Christine", "ABG", Antonov);
    Order order12 = new Order(112L, 60, Currency.UAH, "Mr.Mersedes", "KSD", Danilov);
    Order order13 = new Order(109L, 10, Currency.USD, "Insomnia", "KSD", Petrov);



        List<Order> orderList = new ArrayList<Order>();
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        orderList.add(order4);
        orderList.add(order5);
        orderList.add(order6);
        orderList.add(order7);
        orderList.add(order8);
        orderList.add(order9);
        orderList.add(order10);

//        Collections.sort(orderList);
//        System.out.println(orderList);
//        System.out.println();
//        Collections.sort(orderList, Order.PriceAndCityComp);
//        System.out.println(orderList);
//        System.out.println();
//        Collections.sort(orderList,Order.NameIdCityComp);
//        System.out.println(orderList);

        Set<Order> orderSet = new TreeSet<Order>();
        orderSet.add(order1);
        orderSet.add(order2);
        orderSet.add(order3);
        orderSet.add(order6);
        orderSet.add(order7);
        orderSet.add(order9);
        orderSet.add(order10);
        orderSet.add(order11);
        orderSet.add(order12);
        orderSet.add(order13);

    }


}

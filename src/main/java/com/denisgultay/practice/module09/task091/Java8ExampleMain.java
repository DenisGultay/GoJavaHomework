package com.denisgultay.practice.module09.task091;


import java.util.ArrayList;
import java.util.List;

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


        List<Orders> orderList = new ArrayList<Orders>();
        orderList.add(new Orders(101L, 1000, Currency.USD, "Insomnia", "KSD", Bohdanov));
        orderList.add(new Orders(102L, 2000, Currency.EUR, "Christine", "ABG", Antonov));
        orderList.add(new Orders(103L, 400, Currency.USD, "Misery", "KSD", Viktorov));
        orderList.add(new Orders(104L, 2000, Currency.USD, "Green Mile", "FOL", Danilov));
        orderList.add(new Orders(105L, 4000, Currency.EUR, "Dreamcatcher", "KSD", Pavlov));
        orderList.add(new Orders(106L, 1000, Currency.EUR, "Revival", "ABG", Borisov));
        orderList.add(new Orders(107L, 5000, Currency.USD, "Green Mile", "FOL", Myhailov));
        orderList.add(new Orders(108L, 500, Currency.USD, "Desperation", "KSD", Denisov));
        orderList.add(new Orders(109L, 1500, Currency.USD, "Insomnia", "KSD", Petrov));
        orderList.add(new Orders(110L, 3000, Currency.EUR, "It", "AST", Kirilov));
        orderList.add(new Orders(106L, 1000, Currency.EUR, "Revival", "ABG", Borisov));
        orderList.add(new Orders(109L, 1500, Currency.USD, "Insomnia", "KSD", Petrov));
        orderList.add(new Orders(102L, 2000, Currency.EUR, "Christine", "ABG", Antonov));

//        MethodsClass.sortByPricesDown(orderList);
//        System.out.println("List sorted by prices(decrease): ");
//        orderList.forEach(System.out::println);
//
//        MethodsClass.sortByPricesUpAndCity(orderList);
//        System.out.println("List sorted by prices & user's city: ");
//        orderList.forEach(System.out::println);

//        MethodsClass.sortByItemNameIdAndCity(orderList);
//        System.out.println("List sorted by itemName, order's ID & user's city: ");
//        orderList.forEach(System.out::println);

        MethodsClass.removeDuplicateOrders(orderList);
        System.out.println("List sorted by itemName, order's ID & user's city: ");
        orderList.forEach(System.out::println);
    }
}

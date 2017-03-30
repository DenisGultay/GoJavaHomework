package com.denisgultay.practice.module07.task073;


import com.denisgultay.practice.module04.task042.Currency;
import com.denisgultay.practice.module07.task071.Order;
import com.denisgultay.practice.module07.task071.User;

import java.util.Iterator;
import java.util.TreeSet;

public class SetMain {

    public static void main(String[] args) {

        User Willis = new User(11L, "Bruce", "Willis", "Washington", 50000);
        User Depp = new User(22L, "Johny", "Depp", "Chicago", 55500);
        User DeNiro = new User(33L, "Robert", "DeNiro", "Los-Angeles", 67000);
        User Smith = new User(44L, "Will", "Smith", "Denver", 75000);
        User Pitt = new User(55L, "Brad", "Pitt", "New-York", 85000);
        User Damond = new User(66L, "Mett", "Damond", "Philadelphia", 60500);
        User Statham = new User(77L, "Jason", "Statham", "San-Francisco", 54000);
        User Rives = new User(88L, "Kianu", "Rives", "Huston", 47000);
        User Clooney = new User(99L, "George", "Clooney", "Las-Vegas", 5500);
        User Bale = new User(111L, "Cristian", "Bale", "Boston", 5000);


        TreeSet<Order> orderSet = new TreeSet<>();
        orderSet.add(new Order(101L, 10, Currency.USD, "Insomnia", "KSD", Willis));
        orderSet.add(new Order(102L, 20, Currency.EUR, "Christine", "ABG", Damond));
        orderSet.add(new Order(103L, 40, Currency.UAH, "Misery", "KSD", Smith));
        orderSet.add(new Order(104L, 20, Currency.USD, "Green Mile", "FOL", Bale));
        orderSet.add(new Order(105L, 40, Currency.UAH, "Dreamcatcher", "KSD", Clooney));
        orderSet.add(new Order(106L, 10, Currency.EUR, "Revival", "ABG", Depp));
        orderSet.add(new Order(107L, 50, Currency.UAH, "Stand", "FOL", Statham));
        orderSet.add(new Order(108L, 10, Currency.USD, "Mr.Mersedes", "KSD", Rives));
        orderSet.add(new Order(104L, 20, Currency.USD, "Green Mile", "FOL", Bale));
        orderSet.add(new Order(110L, 30, Currency.UAH, "It", "AST", Pitt));

        System.out.println(orderByUserLastName(orderSet, "Depp"));
        System.out.println(maxPriceOrder(orderSet));
        System.out.println(orderSet);


    }

    public static boolean orderByUserLastName(TreeSet<Order> treeSetOrders, String lastName) {
        for (Order order : treeSetOrders) {
            if (order.getUser().getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    public static Order maxPriceOrder(TreeSet<Order> orders) {

        Order maxPriceOrder = orders.last();
        for (Order order : orders) {
            if (order.getPrice() > orders.last().getPrice()) {
                maxPriceOrder = order;
                break;
            }
        }
        return maxPriceOrder;
    }

    public static void nonDollarOrder(TreeSet<Order> orders) {
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getCurrency().equals(Currency.USD))
                iterator.remove();
        }
    }
}

package com.denisgultay.practice.module09.task091;


import com.denisgultay.practice.module07.task071.Order;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.Collections.reverseOrder;


public final class MethodsClass {

    private MethodsClass() {
    }

    public final static void sortByPricesDown(List<Orders> orders) {
        orders.sort(Comparator.comparing(Orders::getPrice).reversed());
    }

    public final static void sortByPricesUpAndCity(List<Orders> orders) {
        orders.sort(Comparator.comparing(Orders::getPrice)
                .thenComparing((o1, o2) -> o1.getUser().getCity().compareTo(o2.getUser().getCity()))
        );
    }

    public final static void sortByItemNameIdAndCity(List<Orders> orders) {
        orders.sort(Comparator.comparing(Orders::getItemName)
                .thenComparing(Orders::getId)
                .thenComparing((o1, o2) -> o1.getUser().getCity().compareTo(o2.getUser().getCity()))
        );
    }

    public final static void removeDuplicateOrders(List<Orders> orders){
        orders.stream().distinct().collect(Collectors.toList());

    }

}



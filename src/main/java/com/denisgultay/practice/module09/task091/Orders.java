package com.denisgultay.practice.module09.task091;

import java.util.Comparator;

public class Orders implements Comparable<Orders> {
    private long id;
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;
    private User user;

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public void setShopIdentificator(String shopIdentificator) {
        this.shopIdentificator = shopIdentificator;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Orders(long id, int price, Currency currency, String itemName, String shopIdentificator, User user) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Orders)) return false;

        Orders order = (Orders) o;

        if (getId() != order.getId()) return false;
        if (getPrice() != order.getPrice()) return false;
        if (getCurrency() != order.getCurrency()) return false;
        if (getItemName() != null ? !getItemName().equals(order.getItemName()) : order.getItemName() != null)
            return false;
        if (getShopIdentificator() != null ? !getShopIdentificator().equals(order.getShopIdentificator()) : order.getShopIdentificator() != null)
            return false;
        return getUser().equals(order.getUser());
    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + getPrice();
        result = 31 * result + getCurrency().hashCode();
        result = 31 * result + (getItemName() != null ? getItemName().hashCode() : 0);
        result = 31 * result + (getShopIdentificator() != null ? getShopIdentificator().hashCode() : 0);
        result = 31 * result + getUser().hashCode();
        return result;
    }

    public int compareTo(Orders o) {
        return (int) (this.id - o.id);
    }

//    public static Comparator<Orders> PriceCompare = new Comparator<Orders>() {
//        public int compare(Orders o1, Orders o2) {
//            return -(o1.getPrice() - o2.getPrice());
//        }
//    };
//
//    public static Comparator<Orders> PriceAndCityComp = new Comparator<Orders>() {
//
//        public int compare(Orders o1, Orders o2) {
//            int mark = o1.getPrice() - o2.getPrice();
//            if (mark == 0) {
//                mark = o1.getUser().getCity().compareTo(o2.getUser().getCity());
//            }
//            return mark;
//        }
//    };
//    public static Comparator<Orders> NameIdCityComp = new Comparator<Orders>() {
//
//        public int compare(Orders o1, Orders o2) {
//            int mark = o1.getItemName().compareTo(o2.getItemName());
//            if (mark == 0) {
//                mark = (int) (o1.getId() - o2.getId());
//            }
//            if (mark == 0) {
//                mark = o1.getUser().getCity().compareTo(o2.getUser().getCity());
//            }
//            return mark;
//        }
//    };


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", price=" + price +
                ", currency=" + currency +
                ", itemName='" + itemName + '\'' +
                ", shopIdentificator='" + shopIdentificator + '\'' +
                ", user=" + user +
                '}';
    }
}

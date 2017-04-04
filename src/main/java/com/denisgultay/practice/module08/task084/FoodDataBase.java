package com.denisgultay.practice.module08.task084;

import com.denisgultay.practice.module08.task082.Food;
import com.denisgultay.practice.module08.task083.IManageSystem;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FoodDataBase<Food extends Object & Comparable<? super Food>> implements IManageSystem {

   private Map<Food , Double> dataBase;


    @Override
    public Object save(Object obj, double price) {
        dataBase.put((Food) obj, price);
        return null;
    }

    @Override
    public Object save(Object obj) {
        return null;
    }

    @Override
    public void delete(Object obj) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Object get(int id) {
        return null;
    }

    @Override
    public Double getPrice(Object obj) {
        return null;
    }

    @Override
    public Set getProducts() {
        return null;
    }

    @Override
    public List<Double> getPrices() {
        return null;
    }
}

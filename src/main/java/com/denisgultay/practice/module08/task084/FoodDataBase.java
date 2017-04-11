package com.denisgultay.practice.module08.task084;

import com.denisgultay.practice.module08.task082.Food;
import com.denisgultay.practice.module08.task083.IManageSystem;

import java.util.*;

public class FoodDataBase<T extends Food> implements IManageSystem<T> {

    private Map<T, Double> dataBase = new HashMap<>();

    @Override
    public T save(T food, double price) {
        dataBase.put(food, price);
        return food;
    }

    @Override
    public T save(T food) {
        dataBase.put(food, 0.0);
        return food;
    }

    @Override
    public void delete(T food) {
        dataBase.remove(food);
    }

    @Override
    public void deleteById(int id) {
        Set<T> foodId = dataBase.keySet();
        for (Iterator<T> iter = foodId.iterator(); iter.hasNext();){
            if(iter.next().getId() == id)
                iter.remove();
        }
    }

    @Override
    public T get(int id) {
        Set<T> foodId = dataBase.keySet();
        for (T food : foodId) {
            if (food.getId() == id) {
                return food;
            }
        }
        return null;
    }

    @Override
    public Double getPrice(T food) {
        return  dataBase.get(food);
    }

    @Override
    public Set<T> getProducts() {
        return dataBase.keySet();
    }

    @Override
    public List<Double> getPrices() {
        return new ArrayList<>(dataBase.values());
    }

}

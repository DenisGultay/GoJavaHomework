package com.denisgultay.practice.module08.task081;


import com.denisgultay.practice.module08.task082.Food;

public final class IdGenerator {

    private IdGenerator() {
    }

    public final static Integer getNewId(String name, Country country, int expiration) {
        int id = 1;
        int uniqId = id;
        uniqId = uniqId + (country != null ? country.hashCode() : 0);
        uniqId = uniqId + (name != null ? name.hashCode() : 0);
        uniqId = uniqId + expiration;
        return uniqId;
    }

}

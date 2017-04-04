package com.denisgultay.practice.module08.task081;


import com.denisgultay.practice.module08.task082.Food;

public final class IdGenerator {

    private IdGenerator() {
    }

    public static final long createId(){
        long uniqueId = (long) (Math.random()*1000);
    return uniqueId;
    }
}

package com.denisgultay.practice.module08.task081;


import com.denisgultay.practice.module08.task082.Food;

public final class IdGenerator {

    private static Integer basicId = 0;

    private IdGenerator() {
    }

    public final static Integer getNewId() {
        return ++basicId;
    }
}

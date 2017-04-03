package com.denisgultay.practice.module08.task081;


public final class IdGenerator {

    private IdGenerator() {
    }

    public static final long createId(){
        long uniqeId = (long)(System.currentTimeMillis() & 0xfff);
    return uniqeId;
    }
}

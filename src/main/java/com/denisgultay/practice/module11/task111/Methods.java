package com.denisgultay.practice.module11.task111;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Stream;

public final class Methods {

    private Methods() {
    }

    public static final String replacer(Map<String, String> map){
    String nameOfFile = "TextFile.txt";
    try {
        Stream<String> stringStream = Files.lines(Paths.get(nameOfFile));
        stringStream.forEach(System.out::println);
    } catch (IOException e) {
        e.printStackTrace();
    }
    return null;
}
}

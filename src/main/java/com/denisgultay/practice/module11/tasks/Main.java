package com.denisgultay.practice.module11.tasks;


import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        File myFile = new File("TextFile.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(myFile));
            bw.write("First string of file");
            bw.write('\n');
            bw.write("This is second string of file");
            bw.write('\n');
            bw.write("And this is third string of file");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuilder outPutString = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(myFile));
            br.lines().forEach(st -> outPutString.append(st).append('\n'));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String textFromFile = outPutString.toString();
        System.out.println(textFromFile);

        Map<String, String> myMap = new HashMap<>();
        myMap.put("file", "my file");
        myMap.put("string", "new string");

        System.out.println(Methods.replacer(myMap,textFromFile));
        System.out.println(Methods.fileContentReplacer(myMap,textFromFile,myFile));
        System.out.println(Methods.fileContentMerger(myMap,textFromFile,myFile));
        int appearsOfWord = Methods.checkWord("of");
        System.out.println("This word appears " + appearsOfWord + " times");

    }

}

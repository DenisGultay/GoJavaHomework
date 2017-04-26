package com.denisgultay.practice.module11.task111;


import java.io.*;

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
            bw.write(10);
            bw.write("This is second string of file");
            bw.write(10);
            bw.write("And this is third string of file");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    Methods.replacer();

    }

}

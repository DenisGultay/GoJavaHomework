package com.denisgultay.practice.module11.tasks;

import java.io.*;
import java.util.Map;

public final class Methods {

    private Methods() {
    }

    public static final String replacer(Map<String, String> map, String text) {
        String newText = text;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            newText = newText.replaceAll(entry.getKey(), entry.getValue());
        }
        return newText;
    }

    public static final File fileContentReplacer(Map<String, String> map, String textFromFile, File file) {
        String newString = replacer(map, textFromFile);
        try {
            BufferedWriter bufWriter = new BufferedWriter(new FileWriter(file));
            bufWriter.write(newString);
            bufWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public static final File fileContentMerger(Map<String, String> map, String textFromFile, File file) {
        try {
            BufferedWriter bufWriter = new BufferedWriter(new FileWriter(file, true));
            bufWriter.write('\n');
            bufWriter.write(replacer(map, textFromFile));
            bufWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }
// Просто try:
//    public static final int checkWord(String word) {
//        File myFile = new File("TextFile.txt");
//        BufferedReader bufReader = null;
//        int wordsCount = 0;
//        try {
//            bufReader = new BufferedReader(new FileReader(myFile));
//            String line;
//            while ((line = bufReader.readLine()) != null) {
//                String[] singleWords = line.split(" ");
//                for (String st : singleWords) {
// //                   System.out.println(st);
//                    if (st.equals(word)) {
//                        wordsCount++;
//                    }
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if(bufReader!=null){
//                try {
//                    bufReader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return wordsCount;
//    }

//    try - with- resourses:
    public static final int checkWord(String word) {
        File myFile = new File("TextFile.txt");
        int wordsCount = 0;
        try (BufferedReader bufReader = new BufferedReader(new FileReader(myFile))) {
            String line;
            while ((line = bufReader.readLine()) != null) {
                String[] singleWords = line.split(" ");
                for (String st : singleWords) {
                    //                   System.out.println(st);
                    if (st.equals(word)) {
                        wordsCount++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordsCount;
    }

}

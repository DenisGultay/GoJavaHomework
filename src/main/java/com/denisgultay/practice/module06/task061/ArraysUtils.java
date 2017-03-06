package com.denisgultay.practice.module06.task061;

import java.util.Arrays;

public final class ArraysUtils {

    public static final int printSumOfArray(int[] array) {
        int resultSumOfIntegerArray = 0;
        for (int i = 0; i < array.length; i++) {
            resultSumOfIntegerArray += array[i];
        }
        System.out.println("Сума чисел масиву intArray: " + resultSumOfIntegerArray);
        return resultSumOfIntegerArray;
    }


    public static final int printMinOfArray(int[] array) {
        int minIntegerElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minIntegerElement > array[i]) {
                minIntegerElement = array[i];
                System.out.println("Мінімум з чисел масиву intArray: " + minIntegerElement);
            }
        }
        return minIntegerElement;
    }


    public static final int printMaxOfArray(int[] array) {
        int maxIntegerElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxIntegerElement < array[i]) {
                maxIntegerElement = array[i];
            }
        }
        System.out.println("Максимум з чисел масиву intArray: " + maxIntegerElement);
        return maxIntegerElement;
    }


    public static final int maxPositiveOfArray(int[] array) {
        int maxPositiveIntegerElement = array[1];
        for (int i = 0; i < array.length; i++) {
            if (maxPositiveIntegerElement < array[i] && maxPositiveIntegerElement > 0) {
                maxPositiveIntegerElement = array[i];
            }
        }
        if (maxPositiveIntegerElement < 0) {
            System.out.println("Додатніх значень немає");
        } else {
            System.out.println("Максимальне додатнє з чисел масиву intArray: " + maxPositiveIntegerElement);
        }
        return maxPositiveIntegerElement;
    }


    public static final int multiplicationOfArray(int[] array) {
        int multResultOfIntegerArray = 1;
        for (int i = 0; i < array.length; i++) {
            multResultOfIntegerArray *= array[i];
        }
        System.out.println("Добуток чисел масиву intArray: " + multResultOfIntegerArray);
        return multResultOfIntegerArray;
    }


    public static final int firstLastElementModulus(int[] array) {
        int first = array[0];
        int last = array[array.length - 1];
        System.out.println("Модуль першого числа масиву intArray: " + Math.abs(first));
        System.out.println("Модуль останнього числа масиву intArray: " + Math.abs(last));
        return last;
    }


    public static final int secondLargestElementOfArray(int[] array) {
        int largestElement = array[0];
        int secondLargestElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (largestElement < array[i]) {
                secondLargestElement = largestElement;
                largestElement = array[i];
            } else {
                if (array[i] > secondLargestElement) {
                    array[i] = secondLargestElement;
                }
            }
        }
        System.out.println("Друге за величиною число масиву intArray: " + secondLargestElement);
        return secondLargestElement;
    }

    public static final int[] reverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static final int[] findEvenElements(int[] array) {
        int[] evenElementsArray = new int[array.length];
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                evenElementsArray[count] = array[j];
                System.out.print(evenElementsArray[count] + " ");
                count++;
            }
        }
        return evenElementsArray;
    }
}



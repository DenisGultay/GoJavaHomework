package com.denisgultay.practice.module02.task021;

/**
 * Created by Користувач on 31.01.2017.
 */
public class CalculatorOfArrays {

    public static void main(String[] args) {

        int[] intArray = {-1, 3, -5, 1, 4, 2, 7, 11, 13, -3};
        double[] doubleArray = {-1.2, 3.1, -0.5, 1.7, 5.5, 2.5, 0.7, 1.1, 1.3, -3.5};

        CalculatorOfArrays array = new CalculatorOfArrays();

        array.printSumOfArray(intArray);
        array.printSumOfArray(doubleArray);
        array.printMinOfArray(intArray);
        array.printMinOfArray(doubleArray);
        array.printMaxOfArray(intArray);
        array.printMaxOfArray(doubleArray);
        array.maxPositiveOfArray(intArray);
        array.maxPositiveOfArray(doubleArray);
        array.multiplicationOfArray(intArray);
        array.multiplicationOfArray(doubleArray);
        array.firstLastElementModulus(intArray);
        array.firstLastElementModulus(doubleArray);
        array.secondLargestElementOfArray(intArray);
        array.secondLargestElementOfArray(doubleArray);
        array.maxPositiveOfArray(new int[]{-2, -3, -10});
    }


    public int printSumOfArray(int[] array) {
        int resultSumOfIntegerArray = 0;
        for (int i = 0; i < array.length; i++) {
            resultSumOfIntegerArray += array[i];
        }
        System.out.println("Сума чисел масиву intArray: " + resultSumOfIntegerArray);
        return resultSumOfIntegerArray;
    }


    public double printSumOfArray(double[] array) {
        double resultSumOfDoubleArray = 0;
        for (int j = 0; j < array.length; j++) {
            resultSumOfDoubleArray += array[j];
        }
        System.out.println("Сума чисел масиву doubleArray: " + resultSumOfDoubleArray);
        return resultSumOfDoubleArray;
    }


    public int printMinOfArray(int[] array) {
        int minIntegerElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minIntegerElement > array[i]) {
                minIntegerElement = array[i];
                System.out.println("Мінімум з чисел масиву intArray: " + minIntegerElement);
            }
        }
        return minIntegerElement;
    }


    public int printMaxOfArray(int[] array) {
        int maxIntegerElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxIntegerElement < array[i]) {
                maxIntegerElement = array[i];
            }
        }
        System.out.println("Максимум з чисел масиву intArray: " + maxIntegerElement);
        return maxIntegerElement;
    }


    public double printMinOfArray(double[] array) {
        double minDoubleElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minDoubleElement > array[i]) {
                minDoubleElement = array[i];
                System.out.println("Мінімум з чисел масиву doubleArray: " + minDoubleElement);
            }
        }
        return minDoubleElement;
    }


    public double printMaxOfArray(double[] array) {
        double maxDoubleElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxDoubleElement < array[i]) {
                maxDoubleElement = array[i];
            }
        }
        System.out.println("Максимум з чисел масиву doubleArray: " + maxDoubleElement);
        return maxDoubleElement;
    }


    public int maxPositiveOfArray(int[] array) {
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


    public double maxPositiveOfArray(double[] array) {
        double maxPositiveDoubleElement = array[1];
        for (int i = 0; i < array.length; i++) {
            if (maxPositiveDoubleElement < array[i] && maxPositiveDoubleElement > 0) {
                maxPositiveDoubleElement = array[i];
            }
        }
        if (maxPositiveDoubleElement < 0) {
            System.out.println("Додатніх значень немає");
        } else {
            System.out.println("Максимальне додатнє з чисел масиву doubleArray: " + maxPositiveDoubleElement);
        }
        return maxPositiveDoubleElement;
    }


    public int multiplicationOfArray(int[] array) {
        int multResultOfIntegerArray = 1;
        for (int i = 0; i < array.length; i++) {
            multResultOfIntegerArray *= array[i];
        }
        System.out.println("Добуток чисел масиву intArray: " + multResultOfIntegerArray);
        return multResultOfIntegerArray;
    }


    public double multiplicationOfArray(double[] array) {
        double multResultOfDoubleArray = 1;
        for (int i = 0; i < array.length; i++) {
            multResultOfDoubleArray *= array[i];
        }
        System.out.println("Добуток чисел масиву doubleArray: " + multResultOfDoubleArray);
        return multResultOfDoubleArray;
    }


    public int firstLastElementModulus(int[] array) {
        int first = array[0];
        int last = array[array.length - 1];
        System.out.println("Модуль першого числа масиву intArray: " + Math.abs(first));
        System.out.println("Модуль останнього числа масиву intArray: " + Math.abs(last));
        return last;
    }


    public double firstLastElementModulus(double[] array) {
        double first = array[0];
        double last = array[array.length - 1];
        System.out.println("Модуль першого числа масиву doubleArray: " + Math.abs(first));
        System.out.println("Модуль останнього числа масиву doubleArray: " + Math.abs(last));
        return last;
    }


    public int secondLargestElementOfArray(int[] array) {
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


    public double secondLargestElementOfArray(double[] array) {
        double largestElement = array[0];
        double secondLargestElement = array[0];
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
        System.out.println("Друге за величиною число масиву doubleArray: " + secondLargestElement);
        return secondLargestElement;
    }

}


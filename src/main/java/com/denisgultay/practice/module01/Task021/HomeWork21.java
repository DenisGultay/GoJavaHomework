package com.denisgultay.practice.module01.Task021;

/**
 * Created by Користувач on 31.01.2017.
 */
public class HomeWork21 {

    public static void main(String[] args) {

        int[] intArray = {-1, 3, -5, 1, 4, 2, 7, 11, 13, -3};

        double[] doubleArray = {-1.2, 3.1, -0.5, 1.7, 5.5, 2.5, 0.7, 1.1, 1.3, -3.5};

        HomeWork21 array = new HomeWork21();

        array.sum(intArray);

        array.sum(doubleArray);

        array.min(intArray);

        array.min(doubleArray);

        array.max(intArray);

        array.max(doubleArray);

        array.maxPositive(intArray);

        array.maxPositive(doubleArray);

        array.multiplication(intArray);

        array.multiplication(doubleArray);

        array.modulus(intArray);

        array.modulus(doubleArray);

        array.secondLargest(intArray);

        array.secondLargest(doubleArray);
    }


    public void sum(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            sum += array[i];

        }
        System.out.println("Сума чисел масиву intArray: " + sum);
    }

    public void sum(double[] array) {

        double dsum = 0;

        for (int j = 0; j < array.length; j++) {

            dsum += array[j];

        }

        System.out.println("Сума чисел масиву doubleArray: " + dsum);

    }

    public void min(int[] array) {

        int min = array[0];

        for (int i = 0; i < array.length; i++) {

            if (min > array[i]) {

                min = array[i];

                System.out.println("Мінімум з чисел масиву intArray: " + min);
            }
        }
    }

    public void max(int[] array) {

        int max = array[0];

        for (int i = 0; i < array.length; i++) {

            if (max < array[i]) {

                max = array[i];

            }
        }

        System.out.println("Максимум з чисел масиву intArray: " + max);

    }

    public void min(double[] array) {

        double min = array[0];

        for (int i = 0; i < array.length; i++) {

            if (min > array[i]) {

                min = array[i];

                System.out.println("Мінімум з чисел масиву doubleArray: " + min);
            }
        }
    }

    public void max(double[] array) {

        double max = array[0];

        for (int i = 0; i < array.length; i++) {

            if (max < array[i]) {

                max = array[i];

            }
        }

        System.out.println("Максимум з чисел масиву doubleArray: " + max);

    }


    public void maxPositive(int[] array) {

        int max = array[1];

        for (int i = 0; i < array.length; i++) {

            if (max < array[i] && max > 0) {

                max = array[i];

            }

        }

        System.out.println("Максимальне додатнє з чисел масиву intArray: " + max);

    }

    public void maxPositive(double[] array) {

        double max = array[1];

        for (int i = 0; i < array.length; i++) {

            if (max < array[i] && max > 0) {

                max = array[i];

            }

        }

        System.out.println("Максимальне додатнє з чисел масиву doubleArray: " + max);

    }

    public void multiplication(int[] array) {

        int mult = 1;

        for (int i = 0; i < array.length; i++) {

            mult *= array[i];

        }
        System.out.println("Добуток чисел масиву intArray: " + mult);

    }


    public void multiplication(double[] array) {

        double mult = 1;

        for (int i = 0; i < array.length; i++) {

            mult *= array[i];

        }
        System.out.println("Добуток чисел масиву doubleArray: " + mult);

    }

    public void modulus(int[] array) {

        int first = array[0];
        int last = array[array.length - 1];

        System.out.println("Модуль першого числа масиву intArray: " + Math.abs(first));
        System.out.println("Модуль останнього числа масиву intArray: " + Math.abs(last));

    }

    public void modulus(double[] array) {

        double first = array[0];
        double last = array[array.length - 1];

        System.out.println("Модуль першого числа масиву doubleArray: " + Math.abs(first));
        System.out.println("Модуль останнього числа масиву doubleArray: " + Math.abs(last));

    }

    public void secondLargest(int[] array) {

        int largest = array[0];
        int secondLargest = array[0];

        for (int i = 0; i < array.length; i++) {

            if (largest < array[i])

            {
                secondLargest = largest;

                largest = array[i];

            } else if (array[i] > secondLargest) {

                array[i] = secondLargest;

            }

        }

        System.out.println("Друге за величиною число масиву intArray: " + secondLargest);

    }

    public void secondLargest(double[] array) {

        double largest = array[0];
        double secondLargest = array[0];

        for (int i = 0; i < array.length; i++) {

            if (largest < array[i])

            {
                secondLargest = largest;

                largest = array[i];

            } else if (array[i] > secondLargest) {

                array[i] = secondLargest;

            }

        }

        System.out.println("Друге за величиною число масиву doubleArray: " + secondLargest);

    }

}


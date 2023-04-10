package ru.geekbrains;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class dz {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int[] arr1 = generateArray(5);
        int[] arr2 = generateArray(5);
        System.out.println("Первый массив: " + Arrays.toString(arr1));
        System.out.println("Второй массив: " + Arrays.toString(arr2));

        try {
            int[] result = subtractArrays(arr1, arr2);
            System.out.println("Разность массивов: " + Arrays.toString(result));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            int[] result = divideArrays(arr1, arr2);
            System.out.println("Частное массивов: " + Arrays.toString(result));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    static int[] generateArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10) + 1;
        }
        return arr;
    }

    static int[] subtractArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны.");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }

    static int[] divideArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны.");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < result.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Деление на ноль.");
            }
            result[i] = arr1[i] / arr2[i];
        }
        return result;
    }
}
/**
task3: Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен разности элементов двух
 входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
 task4: Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен частному элементов двух
 входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое
 пользователь может увидеть - RuntimeException, т.е. ваше.
*/
package org.example;

import java.util.Arrays;

import static org.example.Home_work_1.divideArrays;
import static org.example.Home_work_1_exmethods.*;
import static org.example.Home_work_1.subArray;

public class Main {
    public static void main(String[] args) {

//        Первый метод
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10, 3};
        int[] result = subArray(array1, array2);
        if (result != null) {
            System.out.println("Разность массивов: " + Arrays.toString(result));
        }

//        Задача со звездочкой
        try {
            int[] resultD = divideArrays(array1, array2);
            System.out.println("Частное массивов: " + Arrays.toString(resultD));
        } catch (RuntimeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

//        Реализация 3х методов с различными исключениями:
//        Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
        try {
            method1();
        } catch (NullPointerException e) {
            System.out.println("Исключение: " + e);
        }

        try {
            method2();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение: " + e);
        }

        try {
            method3();
        } catch (NumberFormatException e) {
            System.out.println("Исключение: " + e);
        }
    }

}

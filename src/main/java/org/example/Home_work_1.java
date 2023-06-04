package org.example;

public class Home_work_1 {

    public static int[] subArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("Длины массивов не равны");
            return null;
        }

        int[] result = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }

    public static int[] divideArrays(int[] arr1, int[] arr2) {
        // Проверяем, равны ли массивы null
        if (arr1 == null || arr2 == null) {
            throw new RuntimeException("Некорректные входные массивы");
        }

        // Проверяем, равны ли длины массивов
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }

        int[] result = new int[arr1.length];

        // Вычисляем частное элементов и сохраняем в новом массиве
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Деление на ноль в ячейке " + i);
            }
            result[i] = arr1[i] / arr2[i];
        }

        return result;
    }

}

package hw8;

import java.util.Arrays;

public class Main8 {
    public static void main(String[] args){
        int[] myArray = new int[15];
        int min = 1;
        int max = 100;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = min + (int) (Math.random() * ((max - min) + 1));

        }
        System.out.println("Початковий вигляд масиву:" + Arrays.toString(myArray));
        sort(myArray);

        int target = 25;
        int result = binarySearch(myArray, target); // Викликаємо бінарний пошук

        if (result == -1) {
            System.out.println("Елемент " + target + " не знайдено в масиві.");
        } else {
            System.out.println("Введіть число для пошуку: " + target + " Індекс числа " + target + " у відсортованому масиві: " + result);
        }
    }

    private static void sort(int arr[]) {
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println("Відсортований масив:" + Arrays.toString(arr));
    }

    public static int binarySearch(int[] arr, int targt) {
        int left = 0; // Початковий індекс
        int right = arr.length - 1; // Кінцевий індекс

        while (left <= right) {
            int mid = left + (right - left) / 2; // Знаходимо середній індекс

            if (arr[mid] == targt) {
                return mid; // Знайдено елемент, повертаємо його індекс
            }

            if (arr[mid] < targt) {
                left = mid + 1; // Ігноруємо ліву частину (шукаємо в правій)
            } else {
                right = mid - 1; // Ігноруємо праву частину (шукаємо в лівій)
            }
        }

        return -1; // Якщо елемент не знайдено, повертаємо -1
    }
}

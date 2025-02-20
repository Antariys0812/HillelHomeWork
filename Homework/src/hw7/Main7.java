package hw7;

import java.util.Arrays;

public class Main7 {
    public static void main(String[] args) {
        int[] myArray = new int[20];
        int min = -100;
        int max = 100;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = min + (int) (Math.random() * ((max - min) + 1));

        }
        System.out.println("Елементи масиву:" + Arrays.toString(myArray));

        int result = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 0) {
                result += myArray[i];
            }
        }
        System.out.println("Сума від'ємних чисел: " + result);

        int parne = 0;
        int neparne = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                parne++;
            } else {
                neparne++;
            }
        }
        System.out.println("Кількість парних чисел: " + parne);
        System.out.println("Кількість непарних чисел: " + neparne);

        int maks = myArray[0];
        int maksi = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > maks) {
                maks = myArray[i];
                maksi = i;
            }
        }
        System.out.println("Найбільший елемент: " + maks + "(з індексом " + maksi + ")");

        int mins = myArray[0];
        int minsi = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < mins) {
                mins = myArray[i];
                minsi = i;
            }
        }
        System.out.println("Найменший елемент: " + mins + "(з індексом " + minsi + ")");

        int firstNegativeIndex = 0;//Індекс першого від'ємного числа
        boolean found = false;
        int count = 0;//Кількість елементів
        int sum = 0;//Сума чисел, розташованих після першого від'ємного числа
        double seredneArefm = 0d;//Середнє арифметичне чисел після першого від'ємного числа
        for (int i = 0; i < myArray.length; i++) {

            if (found == true) {
                count++;
                sum += myArray[i];
            }

            if (myArray[i] < 0 & found == false) {
                firstNegativeIndex = i;
                found = true;
            }

        }

        if (found == false) {
            System.out.println("Від'ємних чисел немає ");
        } else {
            seredneArefm = sum / count;
            System.out.println("Середнє арифметичне чисел після першого від'ємного числа: " + seredneArefm);
        }

    }
}

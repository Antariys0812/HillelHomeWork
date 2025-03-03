package hw10;

import java.util.Arrays;

public class Main10 {
    public static void main(String[] args){

        int kv= 5;
        System.out.println("1. Введіть ціле число: " + kv);
        System.out.println("Квадрат числа " + kv + " дорівнює " + kvadrat(kv) + ".");

        double radius = 3.5;
        double height = 10;
        System.out.println("2. Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume(radius, height) + ".");


        int[] myArray = {10, 20, 30, 40, 50};
        System.out.print("3. Масив чисел: ");
        System.out.println(Arrays.toString(myArray));
        System.out.println("Сума всіх елементів масиву дорівнює " + arr (myArray) + ".");

        String str = "Hello, World!";
        System.out.println("4. Введіть рядок: " + str);
        System.out.println("Рядок в зворотньому порядку: " + reverseString(str));

        int a = 2;
        int b = 3;
        System.out.println("5. Введіть a: " + a);
        System.out.println("Введіть b: " + b);
        System.out.println("Результат " + a +"^" + b + " дорівнює " + stepen(a, b) + ".");

        int n = 4;
        System.out.println("6. Введіть ціле число " + n);
        System.out.println("Введіть текстовий рядок: Java програмування");
        repeat(n, "Java програмування");

    }
    public static int kvadrat (int arg1){
        return arg1*arg1;
    }

    public static double volume(double arg1, double arg2) {
        return Math.PI * Math.pow(arg1, 2) * arg2;

    }
    public static int arr(int[] myArray){
        int result = 0;
        for (int i = 0; i < myArray.length; i++) {
            result += myArray[i];
        }
        return result;
    }

    public static int stepen (int arg1, int arg2){
        return (int)(Math.pow(arg1, arg2));
    }

    public static String reverseString(String str){
        char[] charArray = str.toCharArray();
        char tmp;
        for (int i = 0; i < charArray.length / 2 ; i++){
            tmp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 -i];
            charArray[charArray.length  - i - 1] = tmp;
        }

        return new String(charArray);
    }

    public static void repeat(int arg1, String arg2){
        for (int i = 0; i < arg1; i++) {
            System.out.println(arg2);
        }
    }
}

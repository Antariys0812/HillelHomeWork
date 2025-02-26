package hw9;

import java.util.Arrays;

public class Main9 {
    public static void main(String[] args) {
        int sqSize = 4;
        Integer[][] myArray = new Integer[sqSize][sqSize];
        System.out.println("Матриця " + sqSize + "x" + sqSize + ":");
        int min = 1;
        int max = 50;
        for (int i = 0; i < sqSize; i++) {
            for (int j = 0; j < sqSize; j++) {
                myArray[i][j] = min + (int) (Math.random() * ((max - min) + 1));
                if (myArray[i][j] < 10) {
                    System.out.print(" ");
                }
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }

        int sumNeparRow = 0;//сума значень непарних рядків
        int sumParRow = 0;//сума значень парних рядків

        for (int i = 0; i < sqSize; i++) {
            for (int j = 0; j < sqSize; j++) {
                if (i % 2 != 0) {
                    sumNeparRow += myArray[i][j];
                } else {
                    sumParRow += myArray[i][j];
                }
            }
        }
        System.out.println("Сума елементів у парних рядках (рядок 0, 2): " + sumParRow);
        System.out.println("Сума елементів у непарних рядках (рядок 1, 3): " + sumNeparRow);

        long dobutokNeparColumn = 1;//добуток значень непарних стовпців
        long dobutokParColumn = 1;//добуток значень парних стовпців
        for (int i = 0; i < sqSize; i++) {
            for (int j = 0; j < sqSize; j++) {
                if (j % 2 != 0) {
                    dobutokNeparColumn *= myArray[i][j];
                } else {
                    dobutokParColumn *= myArray[i][j];
                }
            }
        }
        System.out.println("Добуток елементів у парних стовпцях (стовпець 0, 2): " + dobutokParColumn);
        System.out.println("Добуток елементів у непарних стовпцях (стовпець 1, 3): " + dobutokNeparColumn);

        //Магічний квадрат

        int magic = 0;//сума першої діагоналі
        int magic2 = 0;//сума другої діагоналі
        for (int i = 0; i < sqSize; i++) {
            magic += myArray[i][i];
            magic2 += myArray[sqSize - i - 1][i];
        }

        if (magic != magic2) {
            System.out.println("Матриця не є магічним квадратом.");
            return;
        }

        int sumRow = 0; //сума рядка
        int sumColumn = 0; //сума колонки
        for (int i = 0; i < sqSize; i++) {
            sumRow = 0;
            sumColumn = 0;

            for (int j = 0; j < sqSize; j++) {
                sumRow += myArray[i][j];
                sumColumn += myArray[j][i];
            }

            if (sumColumn != magic | sumRow != magic) {
                System.out.println("Матриця не є магічним квадратом.");
                return;
            }
        }
        System.out.println("Матриця є магічним квадратом.");
    }
}


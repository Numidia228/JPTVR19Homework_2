package com.company;

import java.util.Random;
import java.util.Arrays;

public class App {
    public void run() {
        int sum = 0;
        int [] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50 - 1);
        }
        System.out.println("Данные массива: ");
        System.out.println(Arrays.toString(array));
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма данных массива: ");
        System.out.println(sum);
        System.out.println();

        System.out.println("Первая половина массива: ");
        for (int i = array.length / 2; i < array.length ; i++) {
            System.out.printf("%3d ", array[i]);
        }
        System.out.println();
        System.out.println();
        System.out.println("Вторая половина массива: ");
        for (int i = 0; i < array.length / 2; i++) {
            System.out.printf("%3d ", array[i]);
       }
    }
}

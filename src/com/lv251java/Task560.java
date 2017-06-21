package com.lv251java;

import java.util.Iterator;
import java.util.TreeSet;

/**
 Два натуральні числа називають дружніми, якщо кожне з них рівне сумі всіх дільників іншого, крім самого цього числа.
 Знайти всі пари дружніх чисел в діапазоні від 200 до 300.
 */
public class Task560 {
    void calculate() {
        int firstDividerSum;
        int secondDividerSum;
        TreeSet<Integer> amicableNumbers = new TreeSet<>();
        for (int i = 200; i <= 300; i++) {
            firstDividerSum = dividersSum(i);
            for (int j = 200; j <= 300 ; j++) {
                if (i == j && amicableNumbers.contains(j)) continue;
                secondDividerSum = dividersSum(j);
                if (firstDividerSum == j && secondDividerSum == i){
                    amicableNumbers.add(i);
                    amicableNumbers.add(j);
                }
            }
        }
        if (amicableNumbers.isEmpty()) System.out.println("Дружніх чисел не знайдено.");
        else {
            Iterator<Integer> iterator = amicableNumbers.iterator();
            System.out.println("Пара дружніх чисел: " + iterator.next()
                    + " та " + iterator.next() + ".");
        }
    }

    private int dividersSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum;
    }
}

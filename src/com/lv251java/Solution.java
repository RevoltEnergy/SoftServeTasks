package com.lv251java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
	    Solution solution = new Solution();
        System.out.println("********************************************************************************************");
        solution.task182Solution();
        System.out.println("********************************************************************************************");
        solution.task323Solution();
        System.out.println("********************************************************************************************");
        solution.task560Solution();
        System.out.println("********************************************************************************************");
        solution.closeAllStreams();
    }

    private void task182Solution() {
        System.out.println("Дані натуральне число N, і цілі числа a1, ..., aN. Знайти кількість і суму тих членів даної" +
                "\nпослідовності, які діляться на 5, і не діляться 7.");
        System.out.println("Введіть довжину послідовності N:");

        int N = readIntegerFromConsole();

        System.out.println("Згенеровано наступну послідовність з " + N + " чисел:");
        int sequence[] = new int[N];
        for (int i = 0; i < N; i++) {
            sequence[i] = (int) (Math.random() * 100);
            System.out.print(sequence[i] + " ");
        }
        Task182 task182 = new Task182(sequence);
        task182.calculate();
        System.out.println("\nКількість членів послідовності, що діляться на 5 і не діляться на 7: "
                + task182.getCount() + ", а їх сума: " + task182.getSum() + ".");
    }

    private void task323Solution() {
        System.out.println("Дано натуральне число N. Знайдіть всі натуральні числа, менші від N і взаємно прості з ним.");
        System.out.println("Введіть натуральне число N:");

        int N = readIntegerFromConsole();

        System.out.println("Результат для " + N + ":");
        new Task323(N).calculate();
    }

    private void task560Solution() {
        System.out.println("Два натуральні числа називають дружніми, якщо кожне з них рівне сумі всіх дільників іншого," +
                "\nкрім самого цього числа. Знайти всі пари дружніх чисел в діапазоні від 200 до 300.");
        System.out.println("Результат:");
        new Task560().calculate();
    }

    private int readIntegerFromConsole() {
        int N = 0;
        while (N == 0){
            try {
                N = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Будь ласка, введіть натуральне число:");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return N;
    }

    private void closeAllStreams() {
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

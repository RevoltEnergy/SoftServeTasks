package com.lv251java;

/**
 Дані натуральне число N, і цілі числа a1, ..., aN. Знайти кількість і суму тих членів даної послідовності,
 які діляться на 5, і не діляться 7.
*/

class Task182 {
    private int[] sequence;
    private int count = 0;
    private int sum = 0;
    private int N;

    Task182(int[] sequence) {
        this.sequence = sequence;
        this.N = sequence.length;
    }

    void calculate(){
        for (int i = 0; i < N; i++) {
            if (sequence[i] % 5 == 0 && sequence[i] % 7 != 0) {
                count++;
                sum += sequence[i];
            }
        }
    }

    int getCount() {
        return count;
    }

    int getSum() {
        return sum;
    }
}

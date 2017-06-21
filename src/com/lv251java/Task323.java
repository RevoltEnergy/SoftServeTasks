package com.lv251java;

/**
 Дано натуральне число N. Знайдіть всі натуральні числа, менші від N і взаємно прості з ним.
 */
class Task323 {
    private int N;

    Task323(int N) {
        this.N = N;
    }

    void calculate() {
        for (int i = 1; i < N; i++) {
            if (gcd(N, i) == 1) System.out.print(i + " ");
        }
        System.out.println();
    }

    int gcd(int a, int b)
    {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}

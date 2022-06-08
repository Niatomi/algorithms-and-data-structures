package ru.niatomi;

import java.util.Arrays;

/**
 * @author niatomi
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibEffective(50));
    }
    // Slow alg.
    private static long fibNaive(int n) {
        if (n <= 1)
            return n;

        return fibNaive(n - 1) + fibNaive(n - 2);

    }

    private static long fibEffective(int n) {
        long[] array = new long[n + 1];
        array[0] = 0L;
        array[1] = 1L;

        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n - 1];
    }
}

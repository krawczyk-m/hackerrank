package com.hackerrank.mk;

import com.hackerrank.mk.exceptions.MissingArgumentException;

import java.util.Scanner;

public class DiagonalDifference {

    public static int diagDiff(Scanner scanner) throws MissingArgumentException {
        int N = scanner.nextInt();

        int left = 0;
        int right = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!scanner.hasNextInt()) {
                    throw new MissingArgumentException(String.format("Expected %d arguments in line", N));
                }

                int num = scanner.nextInt();
                if (j == i) {
                    left += num;
                }
                if (j == N - i - 1) {
                    right += num;
                }
            }
        }

        return Math.abs(left-right);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println(diagDiff(in));
        } catch (MissingArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

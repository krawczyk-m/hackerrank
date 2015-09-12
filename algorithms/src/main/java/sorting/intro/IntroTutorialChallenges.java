package sorting.intro;

import java.util.Scanner;

public class IntroTutorialChallenges {

    public static int linearSearch(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) return i;
        }

        return -1;
    }

    public static int binarySearch(int[] arr, int n) {
        int p = 0;
        int q = arr.length - 1;
        int r;

        if (q == -1) return -1;

        if (arr[p] == n) return p;
        if (arr[q] == n) return q;

        while (p != q - 1) {
            r = (int) Math.floor((p+q)/2);
            if (arr[r] == n) return r;
            else if (arr[r] > n) q = r;
            else p = r;
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int size = in.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(binarySearch(arr, n));
    }
}

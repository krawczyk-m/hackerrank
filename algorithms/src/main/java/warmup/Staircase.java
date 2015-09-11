package warmup;


import java.util.Scanner;

public class Staircase {

    public static String staircase(int n) {

        StringBuilder sb = new StringBuilder();

        for (int height = n; height > 0; height--) {
            int i = 0;
            for (; i < height - 1; i++) {
                sb.append(' ');
            }
            for ( ; i < n; i++) {
                sb.append('#');
            }
            sb.append('\n');
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        System.out.println(staircase(N));
    }
}

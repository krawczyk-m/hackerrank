package warmup;


import warmup.exceptions.MissingArgumentException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {

    public static List<Float> plusMinus(Scanner scanner) throws MissingArgumentException {
        int N = scanner.nextInt();

        if (N <= 0) {
            throw new IllegalArgumentException("Number of following arguments cannot be lower than 1");
        }

        float positive = 0;
        float negative = 0;
        float zeros = 0;

        float num;
        for (int i = 0; i < N ; i++) {
            if (!scanner.hasNextFloat()) {
                throw new MissingArgumentException(String.format("Expected %d arguments in line", N));
            }
            num = scanner.nextFloat();

            if (num == 0f) {
                zeros++;
            } else if (num > 0f) {
                positive++;
            } else {
                negative++;
            }
        }

        ArrayList<Float> list = new ArrayList<Float>();
        list.add(positive / N);
        list.add(negative / N);
        list.add(zeros/N);

        return list;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            List<Float> list = plusMinus(in);
            System.out.println(String.format("%.3f", list.get(0)));
            System.out.println(String.format("%.3f", list.get(1)));
            System.out.println(String.format("%.3f", list.get(2)));
        } catch (MissingArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

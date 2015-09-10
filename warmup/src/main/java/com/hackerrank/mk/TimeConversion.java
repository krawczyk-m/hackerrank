package com.hackerrank.mk;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TimeConversion {

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

        String date = in.next();

        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ssaa");

        try {
            System.out.println(sdf.parse(date).toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

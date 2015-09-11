package warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static int sum(List<Integer> list) {
        int sum = 0;
        for(Integer i : list) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();

        while(n-- > 0) {
            list.add(in.nextInt());
        }

        System.out.println(sum(list));
    }
}
package pat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main1007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        System.out.println(getPrimeNumberPairs(getPrimeNumber(n)));
    }

    public static int getPrimeNumberPairs(List<Integer> list) {
        int len = list.size();
        int count = 0;
        for (int i = 0; i < len - 1; i++) {
            if (list.get(i + 1) - list.get(i) == 2)
                count++;
        }
        return count;
    }

    public static List<Integer> getPrimeNumber(int n) {
        List<Integer> list = new ArrayList<>();
        boolean flag;
        for (int i = 2; i < n; i++) {
            flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag)
                list.add(i);
        }
        return list;
    }
}

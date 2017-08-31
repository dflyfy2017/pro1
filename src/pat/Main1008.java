package pat;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Author: 10392
 * Date: 2017/8/29
 * Time: 14:11
 */
public class Main1008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt(), m = input.nextInt();
            m %= n;
            int[] arr = new int[n];
            for (int i = 0, k = 0; i < n; i++) {
                if (i + m < n) {
                    arr[i + m] = input.nextInt();
                } else {
                    arr[k++] = input.nextInt();
                }
            }
            System.out.println(Arrays.toString(arr).replaceAll("\\[|\\]|,", ""));
        }
    }

}

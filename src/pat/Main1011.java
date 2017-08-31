package pat;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Author: 10392
 * Date: 2017/8/30
 * Time: 10:13
 */
public class Main1011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextLine();
        }
        for (int j = 0; j < n; j++) {
            System.out.println(judge(arr[j], j+1));
        }
    }

    public static String judge(String s, int num) {
        String[] arr = s.split(" ");
        long pre = Integer.parseInt(arr[0]);
        long suf = Integer.parseInt(arr[1]);
        long res = Integer.parseInt(arr[2]);
        if (pre + suf > res) {
            return "Case #" + num + ": true";
        } else {
            return "Case #" + num + ": false";
        }
    }
}

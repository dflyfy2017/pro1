package pat;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Author: 10392
 * Date: 2017/8/29
 * Time: 15:49
 */
public class Main1009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(reverseString(input.nextLine()));
    }

    public static String reverseString(String s) {
        String[] aS = s.split(" ");
        String res = "";
        for (int i = aS.length - 1; i >= 0; i--) {
            if (i == 0) {
                res += aS[i];
            } else {
                res += aS[i] + " ";
            }
        }
        return res;
    }
}

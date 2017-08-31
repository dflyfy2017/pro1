package pat;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Author: 10392
 * Date: 2017/8/30
 * Time: 10:21
 */
public class Main1012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = input.nextLine().split(" ");
        System.out.println(digitalClassification(arr));
    }

    public static String digitalClassification(String[] arr) {
        String res = "";
        int A1 = 0, A2 = 0, A3 = 0, A4 = 0, A5 = 0;
        boolean flag2 = false;
        int n2 = 0, n4 = 0, len = Integer.parseInt(arr[0]);
        for (int i = 0; i < len; i++) {
            int a = Integer.parseInt(arr[i + 1]);
            int remainder = a % 5;
            switch (remainder) {
                case 0:
                    if (a % 2 == 0) {
                        A1 += a;
                    }
                    break;
                case 1:
                    flag2 = true;
                    A2 += a * (int) Math.pow(-1, n2);
                    n2++;
                    break;
                case 2:
                    A3++;
                    break;
                case 3:
                    A4 += a;
                    n4 += 1;
                    break;
                case 4:
                    A5 = Math.max(A5, a);
                    break;
                default:
                    break;
            }
        }
        res += A1 > 0 ? A1 + " " : "N ";
        if (flag2 == true) {
            res += A2 + " ";
        } else {
            res += "N ";
        }
        res += A3 > 0 ? A3 + " " : "N ";
        if (n4 > 0) {
            res += Math.round(((double) A4 / n4) * 10) / 10.0 + " ";
        } else {
            res += "N ";
        }
        res += A5 > 0 ? A5 + "" : "N";
        return res;
    }
}

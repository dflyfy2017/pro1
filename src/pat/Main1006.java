package pat;

import java.util.Scanner;

public class Main1006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        System.out.println(outputWithOtherFormat(n));
    }

    public static String outputWithOtherFormat(int n) {
        String sN = String.valueOf(n);
        String res = "";
        int len = sN.length();
        for (int i = 0; i < len; i++) {
            if (len == 3) {
                res = getStr(Integer.parseInt(sN.substring(0, 1)), "B") +
                getStr(Integer.parseInt(sN.substring(1, 2)), "S") +
                getStrBit(Integer.parseInt(sN.substring(2)));
            }
            if (len == 2) {
                res = getStr(Integer.parseInt(sN.substring(0, 1)), "S") +
                        getStrBit(Integer.parseInt(sN.substring(1)));
            }
            if (len == 1) {
                res = getStrBit(Integer.parseInt(sN));
            }
        }
        return res;
    }

    public static String getStr(int n, String s) {
        String res = "";
        for (int i = 0; i < n; i ++) {
            res += s;
        }
        return res;
    }

    public static String getStrBit(int n) {
        String res = "";
        for (int i = 0; i < n; i ++) {
            res += (i + 1);
        }
        return res;
    }


}

package pat;

import java.util.Scanner;

public class Main1003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n1 = input.nextLine();
        int n = Integer.parseInt(n1);
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = input.nextLine();
        }
        for (int j = 0; j < n; j++) {
            System.out.println(iWantThrough(str[j]));
        }
    }

    public static String iWantThrough(String str) {
        int countP = 0, countT = 0;
        if (str.indexOf("P") < 0 || str.indexOf("A") < 0
                || str.indexOf("T") < 0) {
            return "NO";
        } else {
            for (int i = 0, len = str.length(); i < len; i++) {
                String temp = str.substring(i, i + 1);
                if (!temp.equals("P")) {
                    if (!temp.equals("T")) {
                        if (!temp.equals("A")) {
                            return "NO";
                        }
                    } else {
                        countT++;
                    }
                } else {
                    countP++;
                }
            }
            if (countP != 1 || countT != 1) {
                return "NO";
            } else {
                String s0 = str.substring(0, str.indexOf("P"));
                String s1 = str.substring(str.indexOf("T") + 1);
                String s2 = str.substring(str.indexOf("P") + 1, str.indexOf("T"));
                if (s0.length() * s2.length() == s1.length()) {
                    return "YES";
                } else {
                    return "NO";
                }
            }
        }
    }
}

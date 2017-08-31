package pat;

import java.util.Scanner;

public class Main1002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        System.out.println(writeThisNumber(n));
    }

    public static String writeThisNumber(String n) {
        String[] chinesePinYin =
                {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
        int num = 0;
        for (int i = 0, len = n.length(); i < len; i++) {
            num += Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        String sNum = String.valueOf(num);
        String res = "";
        for (int j = 0, len2 = sNum.length(); j < len2; j++) {
            if (j == len2 - 1) {
                res += chinesePinYin[Integer.parseInt(String.valueOf(sNum.charAt(j)))];
            } else {
                res += chinesePinYin[Integer.parseInt(String.valueOf(sNum.charAt(j)))] + " ";
            }
        }
        return res;
    }
}

package pat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Author: 10392
 * Date: 2017/8/29
 * Time: 16:00
 */
public class Main1010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        List<Integer> list = seekingGuidance(s);
        System.out.println(list.toString().replaceAll("\\[|\\]|,", ""));
    }

    public static List<Integer> seekingGuidance(String param) {
        List<Integer> res = new ArrayList<>();
        String[] arr = param.split(" ");
        for (int i = 0; i < arr.length - 1; i = i + 2) {
            int pre = Integer.parseInt(arr[i]);
            int suf = Integer.parseInt(arr[i + 1]);
            if (pre * suf != 0) {
                res.add(pre * suf);
                res.add(suf - 1);
            }
        }
        if (param == "" || param.length() ==0 || res.size() == 0) {
            res.add(0);
            res.add(0);
        }
        return res;
    }
}

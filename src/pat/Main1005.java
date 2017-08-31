package pat;

import java.util.*;

public class Main1005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int[] arr = new int[n];
        String s = input.nextLine();
        List<Integer> res = null;
        Set<Integer> rAll = new HashSet<Integer>();
        for (int i = 0, len = arr.length; i < len; i++) {
            arr[i] = Integer.parseInt(s.split(" ")[i]);
        }
        for (int j = 0, len2 = arr.length; j < len2; j++) {
            res = new ArrayList<>();
            res = calculate(arr[j]);
            rAll.addAll(res);
        }
        System.out.println(findKeyNumber(rAll, arr));
    }

    public static String findKeyNumber (Set<Integer> rAll, int[] arr) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (!rAll.contains(arr[i])) {
                res.add(arr[i]);
            }
        }
        Object[] ints = res.toArray();
        Arrays.sort(ints);
        String s = "";
        for (int len = ints.length, i = len - 1 ; i >= 0; i--) {
            if (i == 0) {
                s += ints[i];
            } else {
                s += ints[i] + " ";
            }
        }
        return s;
    }

    public static List<Integer> calculate(int n) {
        List<Integer> res = new ArrayList<Integer>();
        if (n == 1) {
            res.add(n);
            return res;
        }
        do {
            if (n % 2 == 0) {
                n = n / 2;
                res.add(n);
            } else {
                n = (3 * n + 1) / 2;
                res.add(n);
            }
        } while (n != 1);
        return res;
    }

}

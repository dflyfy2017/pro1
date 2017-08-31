package pat;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Author: 10392
 * Date: 2017/8/30
 * Time: 13:31
 */
public class Main1013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pre = 0, suf = 0;
        String[] s = input.nextLine().split(" ");
        pre = Integer.parseInt(s[0]);
        suf = Integer.parseInt(s[1]);
        List<Integer> list = getPrimeNumber(suf);
        for (int i = 1; pre <= suf; pre++, i++) {
            if (i % 10 == 0 || pre == suf) {
                System.out.println(list.get(pre-1));
            } else {
                System.out.print(list.get(pre-1) + " ");
            }
        }
    }

    public static List<Integer> getPrimeNumber(int n) {
        int limit = n < 6 ? 25 : (int) (n * (Math.log(n) + Math.log(Math.log(n))));
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            list.add(i);
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer i = (Integer) iterator.next();
            if (!isPrime(i))
                iterator.remove();
        }
        return list;
    }

    public static boolean isPrime(Integer n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

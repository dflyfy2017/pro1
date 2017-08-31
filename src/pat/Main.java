package pat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(calculate(n));
    }

    public static int calculate(int n) {
        int count = 0;
        if (n == 1) {
            return count;
        }
        do {
            if (n % 2 == 0) {
                n = n / 2;
                count++;
            } else {
                n = (3 * n + 1) / 2;
                count++;
            }
        } while ( !(n==1) );
        return count;
    }
}

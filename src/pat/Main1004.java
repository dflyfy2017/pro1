package pat;

import java.util.Scanner;

public class Main1004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        Student[] stus = new Student[n];
        for (int i = 0; i < n; i++) {
            String[] s = input.nextLine().split(" ");
            stus[i] = new Student(s[0], s[1], Integer.parseInt(s[2]));
        }
        System.out.println(rankScore(stus));
    }

    public static String rankScore (Student[] stus) {
        int max = 0, min = stus[0].score, iMax = 0, iMin = 0;
        for (int i = 0; i < stus.length - 1; i++) {
            if (stus[i].score > max) {
                max = stus[i].score;
                iMax = i;
            }
            if (stus[i].score < min) {
                min = stus[i].score;
                iMin = i;
            }
        }
        return stus[iMax].name + " " + stus[iMax].id + "\n" +
                stus[iMin].name + " " + stus[iMin].id;
    }

    static class Student {
        String name;
        String id;
        int score;
        public Student(){

        }
        public Student(String name, String id, int score) {
            this.name = name;
            this.id = id;
            this.score = score;
        }
    }
}

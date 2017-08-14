package test;


import java.util.ArrayList;

/**
* @author ${user}
* @date ${date} ${time}
* Created By IntelliJIDEA
*/
public class ArrayListTest {

    private static long startTime;
    private static long endTime;

    public static ArrayList<String> add(int len) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            arrayList.add(i + "");
        }
        return arrayList;
    }

    public void readAll(ArrayList<String> arrayList) {
        System.out.println();
    }

    private static long getTime() {
        return System.currentTimeMillis();
    }

    public void start(int len) {
        startTime = getTime();
        ArrayList<String> arrayList = add(len);
        System.out.println("ArrayList:" + (getTime() - startTime));
    }

}

package test;

import java.util.Vector;

public class VectorTest {

    private static long startTime;
    private static long endTime;

    public Vector<String> add(int len) {
        Vector<String> vector = new Vector<>();
        for (int i = 0; i < len; i++) {
            vector.add(i + "");
        }
        return vector;
    }


    private static long getTime() {
        return System.currentTimeMillis();
    }

    public void start(int len) {
        startTime = getTime();
        Vector<String> vector = add(len);
        System.out.println("Vector:" + (getTime() - startTime));
    }

}

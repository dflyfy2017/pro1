package test;

import java.util.LinkedList;

public class LinkedListTest {

    private static long startTime;
    private static long endTime;

    public LinkedList<String> add(int len){
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            linkedList.add(i + "");
        }
        return linkedList;
    }

    private static long getTime() {
        return System.currentTimeMillis();
    }

    public void getOne() {

    }

    public void start(int len) {
        startTime = getTime();
        LinkedList<String> linkedList = add(len);
        System.out.println("LinkedList:" + (getTime() - startTime));
    }
}

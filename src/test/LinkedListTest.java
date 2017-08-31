package test;

import java.util.LinkedList;

public class LinkedListTest {

    private static LinkedList<String> linkedList;

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

    public void getOne(LinkedList<String> linkedList, int index) {
        System.out.println(linkedList.get(index));
    }

    public void start(int len) {
        startTime = getTime();
        linkedList = add(len);
        System.out.println("LinkedList:" + (getTime() - startTime));
    }
}

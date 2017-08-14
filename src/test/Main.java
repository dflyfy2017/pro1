package test;

public class Main {

    private static ArrayListTest arrayListTest = new ArrayListTest();
    private static LinkedListTest linkedListTest = new LinkedListTest();
    private static VectorTest vectorTest = new VectorTest();

    public static void main(String[] args) {
        arrayListTest.start(50000);
        linkedListTest.start(50000);
        vectorTest.start(50000);
    }
}

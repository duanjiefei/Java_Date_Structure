package list.dumyLinkedList;

import list.LinkedList;

public class Test {
    public static void main(String[] args) {
        DumpyHeadLinkedList<Integer> linkedList = new DumpyHeadLinkedList<>();

        for (int i = 0;i < 10;i++){
            linkedList.addFirst(i);
        }


        linkedList.addIndex(0,999);
        linkedList.addIndex(10,999);
        System.out.println(linkedList);
    }
}

package list;

public class Test1 {
    public static void main(String[] args) {
            LinkedList<Integer> linkedList = new LinkedList<>();

            for (int i = 0;i < 10;i++){
                linkedList.addFirst(i);
            }

            System.out.println(linkedList.head);
            System.out.println(linkedList.getSize());
            linkedList.addIndex(0,999);
            linkedList.addIndex(10,999);
            System.out.println(linkedList);
    }
}

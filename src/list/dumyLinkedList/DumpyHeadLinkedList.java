package list.dumyLinkedList;

import list.LinkedList;

public class DumpyHeadLinkedList<E> {

    class  Node{
        E e;
        Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this(e,null);
        }

        public Node(){
            this(null,null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node dumyHead;
    private int size;

    /**
     * 注意  head = null  && dumyHead = new Node(null,null);的区别
     */
    public DumpyHeadLinkedList() {
        size = 0;
        dumyHead = new Node(null,null);//注意使用虚拟头节点的不同之处
        //head = null;
    }


    public void addFirst(E e){
        addIndex(0,e);
    }
    public void addIndex(int index,E e){
        Node pre = dumyHead;
        for (int i = 0;i < index;i++){
            pre = pre.next;
        }

        Node node = new Node(e);
        node.next = pre.next;
        pre.next = node;

        size++;
    }

    public void addLast(E e){
        addIndex(size,e);
    }

    @Override
    public String toString() {
       Node cur = dumyHead;
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < size;i++){
            if (cur != null){
                sb.append(cur.e);
                sb.append("->");
            }
            cur = cur.next;
        }
        sb.append("NULL");
        return sb.toString();
    }
}

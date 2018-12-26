package list;

public class LinkedList<E> {

    class Node{
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



    Node head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    /**
     * 无虚拟结点
     * @param index
     * @param e
     */
    public void addIndex(int index,E e){

        if (index < 0 || index > size){
            throw  new IllegalArgumentException("元素索引非法，无法插入元素");
        }
        if (index == 0){
            addFirst(e);
        }else {
            Node pre = head;//要插入位置的前一个元素  i < index - 1必须注意
            for (int i = 0; i < index - 1;i++){
                pre = pre.next;
            }

            Node node = new Node(e);
            node.next = pre.next;
            pre.next = node;

            //pre.next = new Node(e,pre.next);
            size++;
        }



    }

    public void addFirst(E e){

        Node node =new Node(e);
        node.next = head;
        head = node;

        //head = new Node(e,head)

        size++;
    }

    @Override
    public String toString() {
        Node cur = head;
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

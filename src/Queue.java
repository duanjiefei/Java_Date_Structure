public interface Queue<E> {
    boolean isEmpty();
    int getCapicaty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}

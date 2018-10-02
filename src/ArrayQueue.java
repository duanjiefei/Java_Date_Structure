public class ArrayQueue<E> implements Queue<E> {

    private Array<E> data;
    public ArrayQueue(){
        data = new Array<>();
    }

    public ArrayQueue(int capacity){
        data = new Array<>(capacity);
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public int getCapicaty() {
        return data.getCapacity();
    }

    @Override
    public void enqueue(E e) {
        data.addLast(e);
    }

    @Override
    public E dequeue() {
        return data.removeFirst();
    }

    @Override
    public E getFront() {
        return data.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Queue : ");
        res.append("Front [");
        for (int i = 0; i < data.getSize(); i++){
            res.append(data.get(i));
            if (i != data.getSize()-1){
                res.append(", ");
            }
        }
        res.append("] Tail \n");
        res.append("---------------------------");
        return res.toString();
    }

}

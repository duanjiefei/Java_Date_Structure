public class ArrayStack<E> implements Stack<E> {


    Array<E> data;

    public ArrayStack(){
        data = new Array<>();
    }

    public ArrayStack(int capicaty){
        data = new Array<>(capicaty);
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public E pop() {
        return data.removeLast();
    }

    @Override
    public void push(E e) {
        data.addLast(e);
    }

    @Override
    public E peek() {
        return data.getLast();
    }

    @Override
    public int getCapicaty() {
        return data.getCapacity();
    }

    @Override
    public String toString() {
       StringBuilder res = new StringBuilder();
       res.append("stack : ");
       res.append("[");
       for (int i = 0; i < data.getSize(); i++){
           res.append(data.get(i));
           if (i != data.getSize()-1){
               res.append(", ");
           }
       }
       res.append("] top \n");
       res.append("---------------------------");
       return res.toString();
    }
}

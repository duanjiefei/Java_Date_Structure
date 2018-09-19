public class Array {
    private int size;
    private int[] data;

    public Array(int capicaty){
        data = new int[capicaty];
    }

    public Array(){
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapicaty(){
        return data.length;
    }
}


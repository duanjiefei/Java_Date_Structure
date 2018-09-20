public class Array {
    private int size;
    private int[] data;

    /**
     * 创建元素个数为 capacity 的数组
     * @param capacity
     */
    public Array(int capacity){
        data = new int[capacity];
    }

    /***
     * 默认的构造函数  初始容量为10
     */
    public Array(){
        this(10);
    }

    /**
     * 获取数组元素的个数
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * 获取数组的容量
     * @return
     */
    public int getCapacity(){
        return data.length;
    }

    /**
     * 判断数组元素是否为空
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 向数组中最后的位置添加元素
     * @param e
     */
    public void addLast(int e){
        if (size == data.length){
            throw new IllegalStateException("add last failed,the array is full");
        }
        data[size] = e;
        size++;
    }
}


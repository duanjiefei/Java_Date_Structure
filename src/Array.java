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
/*        if (size == data.length){
            throw new IllegalStateException("add last failed,the array is full");
        }
        data[size] = e;
        size++;*/
        add(size,e);
    }

    /**
     * 向数组的头部添加元素
     * @param e
     */
    public void addFirst(int e){
        add(0,e);
    }

    /**
     * 向数组指定的index位置插入元素
     * @param index
     * @param e
     */
    public void add(int index, int e){
        if (size == data.length){
            throw  new IllegalArgumentException("Add failed,the array is full");
        }

        if (index < 0 || index > data.length){
            throw  new IllegalArgumentException("index is not legal ,add failed");
        }

        for (int i = size - 1;i >= index; i--){
            data[i+1] = data[i];//将数组的元素依次后移
        }
        data[index] = e;
        size++;
    }
}


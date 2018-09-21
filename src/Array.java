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
     * 查询数组索引为index 的元素
     * @param index
     * @return
     */
     int get(int index){
         if (index < 0 || index >= size){
             throw  new IllegalArgumentException("get failed, index is not illegal");
         }
        return  data[index];
     }

    /**
     * 设置元素索引为index 的值
     * @param index
     * @param e
     */
     void set(int index, int e){
         if (index < 0 || index >= size){
             throw  new IllegalArgumentException("set failed, index is not illegal");
         }
        data[index] = e;
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

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array size = %d, Array capacity == %d\n",size,getCapacity()));
        //System.out.println(String.format("Array size = %d, Array capacity == %d",size,getCapacity()));
        res.append("[");
        for (int i = 0; i < size; i++){
            res.append(data[i]);
            if (i != size-1){
                res.append(", ");
            }
        }
        res.append("]\n");
        res.append("-----------------------------\n");
        return res.toString();
    }
}


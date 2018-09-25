public class Array<E> {
    private int size;
    private E[] data;

    /**
     * 创建元素个数为 capacity 的数组
     * @param capacity
     */
    public Array(int capacity){
        data = (E[]) new Object[capacity];
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
     E get(int index){
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
     void set(int index, E e){
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
    public void addLast(E e){
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
    public void addFirst(E e){
        add(0,e);
    }

    /**
     * 向数组指定的index位置插入元素
     * @param index
     * @param e
     */
    public void add(int index, E e){
        if (index < 0 || index > data.length){
            throw  new IllegalArgumentException("index is not legal ,add failed");
        }

        if (size == data.length){
           resize(2 * size);  //注意参数的选择  size  not data.length
        }

        for (int i = size - 1;i >= index; i--){
            data[i+1] = data[i];//将数组的元素依次后移
        }
        data[index] = e;
        size++;
    }

    /**
     * 对数组容量进行变更
     * @param newCapicaty
     */
    private void resize(int newCapicaty) {
        E[] newArray = (E[]) new Object[newCapicaty];
        for (int i = 0; i < size; i++){
            //System.out.println("i == "+ i);
            newArray[i]  = data[i];
        }
        data = newArray;

    }

    /**
     * 判断数组中是否存在元素 e
     * @param e
     * @return
     */
    public boolean isContain(E e){
        for (int i=0;i < size; i++){
            if (e.equals(data[i])){
                return true;
            }
        }
        return false;
    }

    /**
     * 查找数组中元素e 的索引，如果不存在元素e ，返回-1；
     * @param e
     * @return
     */
    public int find(E e){
        for (int i = 0;i < size; i++){
            if (e.equals(data[i])){
                return i;
            }
        }
        return -1;
    }

    /**
     * 删除数组中的某个元素
     * @param index  需要删除的元素的索引
     * @return  将删除的元素进行返回
     */
    public E remove(int index){
        if(index < 0 || index >= size){
            throw  new IllegalArgumentException("remove failed ,index is illegal");
        }
        E ret = data[index];
        for (int i = index + 1;i < size; i++){
             data[i-1] =data[i];
        }
        size --;
        if (size == data.length/2){
            resize(data.length/2);//对数组进行缩容
        }
        return ret;
    }

    /**
     * 将指定元素进行删除
     * @param e
     */
    public void removeElement(E e ){
        int index = find(e);
        if (index!=-1){
            remove(index);
        }
    }

    /**
     * 将数组的第一个元素进行删除
     */
    public E removeFirst(){
        return remove(0);
    }


    /**
     * 将数组的最后一个元素进行删除
     * @return
     */
    public  E removeLast(){
        return remove(size-1);
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


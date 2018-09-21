public class Main {

    /**
     * 数组的基本使用
     * @param args
     */
    public static void main(String[] args) {
/*        int[] ary = new int[10];
        for (int i=0; i<ary.length;i++){
            ary[i] = i;
            System.out.println(ary[i]);
        }

        for (int i:ary) {
            System.out.println("for each  "+ ary[i]);
        }*/

        //测试自己的数组
        Array ary  = new Array(20);

        for(int i = 0;i < 15; i++){
            ary.addLast(i);
        }

        ary.addFirst(-1);
        System.out.print(ary);

        ary.set(0,1000);

        ary.set(19,300);

        System.out.println(ary);
    }
}

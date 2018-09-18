public class Main {

    /**
     * 数组的基本使用
     * @param args
     */
    public static void main(String[] args) {
        int[] ary = new int[10];
        for (int i=0; i<ary.length;i++){
            ary[i] = i;
            System.out.println(ary[i]);
        }

        for (int i:ary) {
            System.out.println("for each  "+ ary[i]);
        }
    }
}

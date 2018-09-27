public class ArrayStackTest {
        public static void main(String[] args) {
            ArrayStack stack = new ArrayStack();
            for(int i = 0;i < 10;i ++){
                stack.push(i);
                System.out.println(stack.toString());
            }
            stack.pop();
            System.out.println(stack.toString());
            stack.peek();
            System.out.println(stack.toString());
            System.out.println(stack.getCapicaty());
            System.out.println(stack.isEmpty());
        }
}

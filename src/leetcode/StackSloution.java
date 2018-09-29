package leetcode;

import java.util.Stack;


/**
 *
 * 判断 str == '[]{}()  '类似的符号是否为合法的匹配符
 */
public class StackSloution {
    public static boolean isValide(String s){
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i ++){
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else {
                if (stack.empty()){
                    return false;
                }

                char topChar = stack.pop();
                if (topChar == '(' && c !=')'){
                    return false;
                }

                if (topChar == '[' && c != ']'){
                    return false;
                }

                if (topChar == '{' && c != '}'){
                    return false;
                }
            }
        }
    return stack.empty();
    }

    public static void main(String[] args) {
        String str = "[][]{}[}";
        System.out.println(StackSloution.isValide(str));
    }
}

package Leetcode;
import java.util.Stack;

public class validParenthesis {
    public static void main(String[] args) {
        validParenthesis vp = new validParenthesis();
        String s = "{[()]}";
        if (!vp.isValid(s)) {
            System.out.println("Invalid Parenthesis");
            return;
        }
        System.out.println("Valid Parenthesis");
    }

    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{') {
                myStack.push('}');
            } else if (ch == '[') {
                myStack.push(']');
            } else if (ch == '(') {
                myStack.push(')');
            } else {
                if (myStack.isEmpty() || myStack.pop() != ch) {
                    return false;
                }
            }
        }
        return myStack.isEmpty();
    }
}
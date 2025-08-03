package DSA_implementation;

import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        // Stack operations
        //Stack push, pop, peek, isEmpty, size
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        System.out.println("Stack: " + myStack.peek());
        myStack.pop();
        System.out.println("The top element: " + myStack.peek());
        System.out.println("Is stack empty? " + myStack.isEmpty());
        System.out.println("Stack size: " + myStack.size());
        System.out.println("Stack elements: " + myStack);
        myStack.pop();
        myStack.pop();
        myStack.pop();
        System.out.println(myStack.isEmpty());

        
    }    
}


//Every operation in the stack is O(1) time complexity.
//Stack is a LIFO data structure, meaning the last element added is the first one to be removed.
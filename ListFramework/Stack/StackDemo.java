package Java_Collections.ListFramework.Stack;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(10);
        stack.remove(0);
        System.out.println(stack.search(5));
          System.out.println(stack);
        // stack.pop();
        // stack.peek();
      
    }
}

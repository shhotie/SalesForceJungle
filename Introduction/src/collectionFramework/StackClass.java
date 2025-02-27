package collectionFramework;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        /*
        Stack = Linear DS which follows LIFO (last in first out) approach.
        operations performed =
        1. push = add
        2. pop = remove
        3. peek = return top element
        4. isEmpty
        5. size = no of elements present
         */

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Is stack empty = " + stack.isEmpty());
        System.out.println("Peek element = " + stack.peek() );
        System.out.println("Size of stack  = " + stack.size());
        System.out.println("Popped element = " + stack.pop());

    }
}

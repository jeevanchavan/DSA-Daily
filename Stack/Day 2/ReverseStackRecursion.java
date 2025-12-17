import java.util.Stack;

public class ReverseStackRecursion {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        // Push elements into stack
        s.push(1);
        s.push(2);
        s.push(3);

        // Reverse the stack using recursion
        reverseStack(s);

        // Print the reversed stack
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    // Function to reverse the stack
    static void reverseStack(Stack<Integer> s) {

        // Base case: if stack is empty, return
        if (s.isEmpty()) {
            return;
        }

        // Remove top element
        int top = s.pop();

        // Reverse the remaining stack
        reverseStack(s);

        // Push the removed element at the bottom
        pushAtBottom(s, top);
    }

    // Helper function to push an element at the bottom of stack
    static void pushAtBottom(Stack<Integer> s, int data) {

        // If stack is empty, push data
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        // Remove top element
        int top = s.pop();

        // Recursive call
        pushAtBottom(s, data);

        // Push the removed element back
        s.push(top);
    }
}

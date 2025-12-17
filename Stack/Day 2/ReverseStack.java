// Brute force 
// TC -> O(n) and SC -> O(n)

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        // Push elements into stack
        s.push(1);
        s.push(2);
        s.push(3);

        // Reverse the stack
        reverseStack(s);

        // Print the reversed stack
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

    // Function to reverse a stack using an extra stack
    static void reverseStack(Stack<Integer> s) {

        // Extra stack to store elements
        Stack<Integer> st = new Stack<>();

        // Move all elements from original stack to extra stack
        // This reverses the order
        while (!s.isEmpty()) {
            st.push(s.pop());
        }

        // Move elements back to original stack
        // Now original stack is reversed
        while (!st.isEmpty()) {
            s.push(st.pop());
        }
    }
}

import java.util.*;

public class PushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        // Push 4 at the bottom of the stack
        pushAtBottom(s, 4);

        // Print stack elements
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

    // Function to push an element at the bottom of stack
    static void pushAtBottom(Stack<Integer> s, int data) {

        // Base case: if stack is empty, insert data
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

    /*
     Time Complexity (TC):
     - O(n), where n is the number of elements in the stack
     - Each element is popped and pushed once

     Space Complexity (SC):
     - O(n) due to recursive call stack
     - No extra data structure is used
    */
}

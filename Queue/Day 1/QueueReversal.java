import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
    
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // Adding elements to the queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        // Reverse the queue
        reverseQueue(q);

        // Print reversed queue
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
    }

    static void reverseQueue(Queue<Integer> q){

        // Stack is used to reverse the order
        Stack<Integer> s = new Stack<>();

        // Edge case: if queue is empty
        if(q.isEmpty()){
            System.out.println("Queue is empty");
            return;
        }

        // Step 1: Remove elements from queue and push into stack
        // This reverses the order
        // Time: O(n)
        while(!q.isEmpty()){
            s.push(q.remove());
        }

        // Step 2: Pop elements from stack and add back to queue
        // Queue now becomes reversed
        // Time: O(n)
        while(!s.isEmpty()){
            q.add(s.pop());
        }

        /*
         Time Complexity (TC):
         - O(n)
         - Each element is moved twice (queue → stack → queue)

         Space Complexity (SC):
         - O(n)
         - Extra stack is used to store all elements
        */
    }
}

import java.util.LinkedList;
import java.util.Queue;

public class InterleaveQueue {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // Adding elements to the queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        // Call function to interleave the queue
        interleaveQueue(q);

        // Print the interleaved queue
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
    }

    static void interleaveQueue(Queue<Integer> q){

        // Total number of elements in queue
        int n = q.size();

        // Extra queue to store first half elements
        Queue<Integer> first = new LinkedList<>();

        // Step 1: Move first half of elements into 'first' queue
        // Time: O(n/2)
        for(int i = 0; i < n / 2; i++){
            first.add(q.remove());
        }

        // Step 2: Interleave elements from 'first' and remaining queue
        // Time: O(n/2)
        while(!first.isEmpty()){
            q.add(first.remove()); // element from first half
            q.add(q.remove());     // element from second half
        }

        /*
         Time Complexity (TC):
         - O(n)
         - Each element is removed and added a constant number of times.

         Space Complexity (SC):
         - O(n/2) → O(n)
         - Extra queue is used to store half of the elements.
        */
    }
}

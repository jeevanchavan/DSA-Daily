// Time & Space Complexity

// Time Complexity: O(n)
// Fast and slow pointers traverse the list once.

// Space Complexity: O(1)
// No extra data structure used.

public class DetectCycle {
    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // head of linked list
    static Node head;

    // Floyd’s Cycle Detection Algorithm
    static boolean detectCycle(Node head) {
        Node slow = head;
        Node fast = head;

        // move slow by 1 step, fast by 2 steps
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // if they meet → cycle exists
            if (slow == fast) {
                return true;
            }
        }
        return false; // no cycle
    }

    public static void main(String[] args) {

        // create nodes
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // create cycle: last node → second node
        head.next.next.next.next = head.next;

        System.out.println(detectCycle(head));
    }
}

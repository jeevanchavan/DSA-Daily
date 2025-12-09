public class RemoveCycle {
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
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head.next.next.next.next = head.next.next;

        removeCycle(head);
    }

    static void removeCycle(Node head){
        // Detect Cycle

        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;  // +2

            if(slow == fast){
                cycle = true;
                break;
            }
        }

        if(cycle == false){
            return;
        }


        // Finding meeting point
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        
        // remove cycle - last.next = null

        prev.next = null;
    }
}

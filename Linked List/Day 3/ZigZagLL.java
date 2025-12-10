public class ZigZagLL {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    static Node head;

    // print list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    static Node zigZag(Node head){
        // find Midnode
        Node midNode = findMid(head);

        // 2nd half reverse
        Node prev = null;
        Node curr = midNode.next;
        midNode.next = null;          // Break list in two halfs
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // alt merge
        Node RH = prev;
        Node LH = head;
        Node nextL, nextR;

        while(LH != null && RH != null){
            // Zig zag logic
            nextL = LH.next;
            LH.next = RH;
            nextR = RH.next;
            RH.next = nextL;

            // Update
            LH = nextL;
            RH = nextR;
        }
        return head;
    }

    static Node findMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        
        zigZag(head);
        printList(head);
    }
}

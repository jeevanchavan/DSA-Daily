public class RemoveMidnode {

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


    static Node removeMidenode(Node head){
        if(head.next == null ){
            return null;
        }

        // find Midnode
        Node slow = head;
        Node fast = head.next.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node midNode = slow;

        // delete middle
        midNode.next = midNode.next.next;

        return head;
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        removeMidenode(head);
        printList(head);
    }
}

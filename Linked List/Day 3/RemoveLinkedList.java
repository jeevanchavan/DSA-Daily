// Given the head of a linked list and an integer val, remove all the nodes of
//  the linked list that has Node.val == val, and return the new head.

public class RemoveLinkedList {
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

    static Node removeNode(Node head, int val){
        Node dummy = new Node(-1);
        dummy.next = head;

        Node temp = dummy;
        while(temp.next != null){
            if(temp.next.data == val){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head = removeNode(head, 1);
        printList(head);
    }
}

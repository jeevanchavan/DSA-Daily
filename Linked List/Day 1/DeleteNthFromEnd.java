// Time Complexity ⏱️

// O(n) ✅

// Why?

// First while loop → counts size → runs n times

// for loop → goes till (size - n) → again n times

// So total work is linear → O(n)

// Space Complexity 💾

// O(1) ✅

// Why?

// Uses only a few variables: temp, prev, sz

// No extra data structures

class DeleteNthFromEnd {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // Methods ->
    // Add()
    
    // AddFirst
    public void addFirst(int data){
        //create a node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // AddLast
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    
    // Print Data
    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    // add node in Middle
    public void add(int idx,int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    // Remove First
    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    
    // Remove last
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }


    // Delete Nth Node from end
    public void deleteNthFromEnd(int n){
        if(head == null){
            return;
        }

        // calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head = head.next;
            return;
        }

        // invalid n
        if(n > sz){
            return;
        }

        Node prev = head;
        for(int i=1; i<sz-n; i++){
            prev = prev.next;
        }

        prev.next = prev.next.next;
    }


    public static void main(String[] args) {
        DeleteNthFromEnd ll = new DeleteNthFromEnd();

        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.print();

        ll.deleteNthFromEnd(3);
        System.out.println("After Deleting:");
        ll.print();
    }
}
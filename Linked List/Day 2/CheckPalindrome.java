// Time Complexity (TC): O(n)
// Space Complexity (SC): O(1)

class CheckPalindrome {

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

    // Find MidNode -> (Fast and Slow Pointer)

    static Node findMidNode(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // checkpalindrome List Logic
    static boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        // step 1 -> find middle node
        Node midNode = findMidNode(head);
        // step 2 -> Reverse the 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }

        Node right = prev;
        Node left = head;

        // step 3 -> compare 1st and 2nd half

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }


    public static void main(String[] args) {
        CheckPalindrome ll = new CheckPalindrome();

        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(1);
        ll.addLast(1);

        ll.print();
        
        boolean ans = checkPalindrome();
        System.out.println(ans);
    }
}
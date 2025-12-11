// 🔥 Pattern Rule:
// Length A = x  
// Length B = y  
// Diff = |x - y|  

// Move longer pointer by diff steps  
// Then move both pointers together  


public class IntersectionOfTwoLists {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    static Node headA;
    static Node headB;

    static Node findIntersection(Node headA, Node headB){
        // edge
        if(headA == null || headB == null){
            return null;
        }

        // length of list A
        Node tempA = headA;
        int cnt1 = 0;
        while(tempA != null){
            
            cnt1++;
            tempA = tempA.next;
        }

        // length of list B
        Node tempB = headB;
        int cnt2 = 0;
        while(tempB != null){
            
            cnt2++;
            tempB = tempB.next;
        }

        // difference cal
        int diff = Math.abs(cnt1-cnt2);
        tempA = headA;
        tempB = headB;

        while(diff > 0){
            if(cnt1 > cnt2){
                tempA = tempA.next;
                diff--;
            }
            else{
                tempB = tempB.next;
                diff--;
            }
        }

        // both pointer sath sath chalaoo
        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return tempA;
    }
    
    public static void main(String[] args) {
        headA = new Node(1);
        headA.next = new Node(2);

        headB = new Node(6);
        headB.next = new Node(7);
        headB.next.next = new Node(8);
        headB.next.next.next = new Node(9);

        // Create proper shared node
        Node inter = new Node(8);

        // Attach intersection
        headA.next.next = inter;
        headB.next.next.next = inter;

        Node ans = findIntersection(headA, headB);
        System.out.println(ans.data);
    }
}

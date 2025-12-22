
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {

    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        // isEmpty
        boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        // add -> O(1)
        void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }
            else{
                q2.add(data);
            }
        }

        // remove -> O(n)
        int pop() {
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }

            int top = -1;
            // case 1
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }else{  //case2
                while(!q2.isEmpty()){
                    top = q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        // peek
        int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }

            int top = -1;
            // case 1
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    q2.add(top);
                }
            }else{  //case2
                while(!q2.isEmpty()){
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}

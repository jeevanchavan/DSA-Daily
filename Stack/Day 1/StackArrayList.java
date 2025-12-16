import java.util.*;

public class StackArrayList {

    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        // isEmpty
        boolean isEmpty(){
            return list.isEmpty();
        }

        // push
        void push(int data){
            list.add(data);
        }

        // pop
        int pop(){
            if(isEmpty()){
                return -1;
            }

            int pop = list.get(list.size()-1);
            list.remove(list.size()-1);
            return pop;
        }

        // peek
        int peek(){
            if(isEmpty()){
                return -1;
            }
            
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
import java.util.Stack;

public class NextGreaterOptimal {
    public static void main(String[] args) {
        int[] nums ={6,8,0,1,3};

        int[] ans = findNextGreater(nums);

        for(int num : ans){
            System.out.print(num+" ");
        }
    }

    static int[] findNextGreater(int[] nums){
        int[] nextGreater = new int[nums.length];
        Stack<Integer> s = new Stack<>();

        for(int i=nums.length-1; i>=0; i--){
            // 1. while
            while(!s.isEmpty() && nums[s.peek()] <= nums[i]){
                s.pop();
            }

            // 2.if-else
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = nums[s.peek()];
            }

            // 3. push(i)
            s.push(i);
        }
        return nextGreater;
    }
}

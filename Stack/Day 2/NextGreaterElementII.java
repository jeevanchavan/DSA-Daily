import java.util.Stack;

public class NextGreaterElementII {
    public static void main(String[] args) {

        int[] nums = {1, 2, 1};
        int[] ans = nextGreaterElements(nums);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }

    static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nextGreater = new int[n];
        Stack<Integer> s = new Stack<>();

        // loop runs twice to handle circular array
        for (int i = 2 * n - 1; i >= 0; i--) {

            int idx = i % n; // circular index

            // remove smaller or equal elements
            while (!s.isEmpty() && nums[s.peek()] <= nums[idx]) {
                s.pop();
            }

            // fill answer only in first round
            if (i < n) {
                if (s.isEmpty()) {
                    nextGreater[idx] = -1;
                } else {
                    nextGreater[idx] = nums[s.peek()];
                }
            }

            // push current index
            s.push(idx);
        }
        return nextGreater;
    }
}


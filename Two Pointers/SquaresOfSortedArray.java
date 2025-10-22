// Two pointers -> S.C O(n) and T.C O(n)

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 3, 10};
        int[] ans = getSquares(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] getSquares(int[] nums){
        int n = nums.length;
        int[] res = new int[n];
        int left = 0, right = n-1;
        int pos = n-1;

        while(left <= right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                int leftSqaure = nums[left] * nums[left];
                res[pos] = leftSqaure;
                left++;
            }
            else{
                int rightSquare = nums[right] * nums[right];
                res[pos] = rightSquare;
                right--;
            }
            pos--;
        }
        return res;
    }
}


// public class SquaresOfSortedArray {
//     public static void main(String[] args) {
//         int[] nums = {-4, -1, 3, 10};
//         int[] ans = getSquares(nums);
//         System.out.println(Arrays.toString(ans));
//     }

//     static int[] getSquares(int[] nums){
//         int n = nums.length;
//         int left = 0, right = n-1;
//         int pos = n-1;

//         while(left <= right){
//             if(Math.abs(nums[left]) > Math.abs(nums[right])){
//                 int leftSqaure = nums[left] * nums[left];
//                 nums[pos] = leftSqaure;
//                 left++;
//             }
//             else{
//                 int rightSquare = nums[right] * nums[right];
//                 nums[pos] = rightSquare;
//                 right--;
//             }
//             pos--;
//         }
//         return nums;
//     }
// }

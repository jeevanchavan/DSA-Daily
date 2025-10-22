//Given an integer array nums, 
// find the subarray with the largest sum, and return its sum.

// Brute-Force

// public class MaximumSubarraySum {
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,-1,-1};
//         int res = maxSubarraySum(arr);
//         System.out.println(res);
//     }

//     static int maxSubarraySum(int[] arr){
//         int max = Integer.MIN_VALUE;
//         for(int i=0; i<arr.length; i++){
//             for(int j=0; j<arr.length; j++){
//                 int sum = 0;

//                 for(int k=i; k<=j; k++){
//                     sum += arr[k];
//                 }

//                 max = Math.max(max, sum);
//             }
//         }

//         return max;
//     }
// }

// Better Approach -> O(n^2)

// public class MaximumSubarraySum {
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,-1,-1};
//         int res = maxSubarraySum(arr);
//         System.out.println(res);
//     }

//     static int maxSubarraySum(int[] arr){
//         int max = Integer.MIN_VALUE;
//         for(int i=0; i<arr.length; i++){
//             int currSum = 0;
//             for(int j=i; j<arr.length; j++){
//                 currSum += arr[j];
//                 max = Math.max(max,currSum);
//             }
//         }
//         return max;
//     }
// }

// Optimal Approach -> O(n) [Kadane's Algorithm]

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,-1,-1};
        int res = maxSubarraySum(arr);
        System.out.println(res);
    }

    static int maxSubarraySum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<arr.length; i++){
            currSum = Math.max(arr[i], currSum+arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}
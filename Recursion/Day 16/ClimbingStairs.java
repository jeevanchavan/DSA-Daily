// public class ClimbingStairs{
//     public static void main(String[] args) {
//         int n = 5;
//         int ans = climbStairs(n);
//         System.out.println(ans);
//     }
//     static int climbStairs(int n) {
//         //base case
//         if(n == 0 || n == 1) return 1;

//         int oneStep = climbStairs(n-1);
//         int twoStep = climbStairs(n-2);

//         int totalWays = oneStep + twoStep;
//         return totalWays;
//     }
// }


//  It gives time limit exceed 
// here we can use DP with memoization tech by storing smaller subproblems in diff
// map ds
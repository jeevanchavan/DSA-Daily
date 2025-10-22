// Brute Force Approach -> O(n^2)

// public class BuyAndSellStock {
//     public static void main(String[] args) {
//         int[] nums = {1,2,3,4,5};
//         int res = getProfit(nums);
//         System.out.println(res);
//     }

//     static int getProfit(int[] nums){
//         int profit = 0;
//         for(int i=0; i<nums.length; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 int newProfit = nums[j] - nums[i];
//                 if(newProfit > profit){
//                     profit = newProfit;
//                 }
//             }
//         }
//         return profit;
//     }
// }

// Optimal Approach -> O(n)

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int res = getProfit(nums);
        System.out.println(res);
    }

    static int getProfit(int[] nums){
        int maxProfit = 0;
        int minPriceSoFar = nums[0];

        for(int i=0; i<nums.length; i++){
            int potentialProfit = nums[i] - minPriceSoFar;
            if(potentialProfit > maxProfit){
                maxProfit = potentialProfit;
            }

            if (nums[i] < minPriceSoFar) {
                minPriceSoFar = nums[i];
            }
        }
        return maxProfit;
    }
}
import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {

        int profit[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int maxWeight = 50;

        // ratio[i][0] = index of item
        // ratio[i][1] = profit / weight (value per unit weight)
        double ratio[][] = new double[profit.length][2];

        // Calculate profit-to-weight ratio for each item
        for (int i = 0; i < profit.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = profit[i] / (double)weight[i]; // ratio
        }

        // Sort items based on ratio (ascending)
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int totalProfit = 0;     // total profit collected
        int capacity = maxWeight; // remaining knapsack capacity

        // Traverse from highest ratio to lowest
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];

            // If full item can be taken
            if (capacity >= weight[idx]) {
                capacity -= weight[idx];
                totalProfit += profit[idx];
            }
            // Take fractional part of item
            else {
                totalProfit += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        // Final maximum profit
        System.out.println("Total Profit : " + totalProfit);
    }
}
// TC: O(n log n) → sorting items by ratio
// SC: O(n) → ratio array
import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {

        // Available coin denominations
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 200, 500};

        // Total amount to make
        int amount = 670;

        // Sort coins in descending order (greedy step)
        Arrays.sort(coins, Comparator.reverseOrder());

        // To store coins used
        ArrayList<Integer> list = new ArrayList<>();

        int count = 0;

        // Pick coins greedily
        for (int i = 0; i < coins.length; i++) {

            // Use current coin if it is <= remaining amount
            while (coins[i] <= amount) {
                amount -= coins[i];   // reduce amount
                list.add(coins[i]);   // add coin to list
                count++;              // increase coin count
            }
        }

        // Output
        System.out.println("Maximum coins needed are: " + count);
        System.out.println("Coins used: " + list);
    }
}

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];

        // Calculate stock span
        findSpan(stocks, span);

        // Print span array
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }

    // Function to calculate stock span
    static void findSpan(int stocks[], int span[]) {

        // Stack stores INDEX of days
        Stack<Integer> s = new Stack<>();

        // First day span is always 1
        span[0] = 1;
        s.push(0);

        // Traverse from second day
        for (int i = 1; i < stocks.length; i++) {

            int currPrice = stocks[i];

            // Pop all smaller or equal prices from stack
            while (!s.isEmpty() && currPrice > stocks[s.peek()]) {
                s.pop();
            }

            // If stack becomes empty
            // Means current price is highest so far
            if (s.isEmpty()) {
                span[i] = i + 1;
            } 
            // Else previous higher price exists
            else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }

            // Push current index to stack
            s.push(i);
        }
    }

    /*
     Time Complexity (TC):
     - O(n)
     - Each element is pushed and popped once

     Space Complexity (SC):
     - O(n)
     - Stack stores indices
    */
}

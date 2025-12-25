// Greedy Pattern:
// - Sort children greed and cookie sizes
// - Use two pointers
// - Give smallest valid cookie to smallest child

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int g[] = {1,2,3};
        int s[] = {1,1};

        // Sort greed factors of children
        Arrays.sort(g);

        // Sort cookie sizes
        Arrays.sort(s);

        int childSatisfied = 0; // count of satisfied children
        int i = 0; // pointer for children
        int j = 0; // pointer for cookies

        // Traverse while children and cookies are available
        while (i < g.length && j < s.length) {

            // If current cookie can satisfy current child
            if (s[j] >= g[i]) {
                childSatisfied++; // child is satisfied
                i++;              // move to next child
                j++;              // move to next cookie
            } 
            // Cookie too small, try bigger cookie
            else {
                j++;              // move to next cookie
            }
        }
        
        System.out.println("Students got the cookie: "+childSatisfied);
    }
}

// TC: O(n log n + m log m) → sorting children and cookies
// SC: O(1) → no extra space (ignoring sort space)

// Key Idea: Make locally optimal choice to get global optimum

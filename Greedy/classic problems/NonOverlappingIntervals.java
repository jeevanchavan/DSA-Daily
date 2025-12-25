// Greedy Pattern:
// - Sort intervals by end time
// - Keep intervals with earliest end
// - Count how many intervals must be removed

// Key Idea: Make locally optimal choice to get global optimum


import java.util.Arrays;

public class NonOverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};

        // Sort intervals by end time
        // TC for sort: O(n log n)
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int remove = 0;              // count of removed intervals
        int lastEnd = intervals[0][1]; // end time of last selected interval

        // Start from index 1 (first interval already selected)
        for(int i = 1; i < intervals.length; i++){
            // If current interval overlaps with previous one
            if(intervals[i][0] < lastEnd){
                remove++; // remove current interval
            } else {
                // No overlap, update lastEnd
                lastEnd = intervals[i][1];
            }
        }

        // Final answer
        System.out.println("Number of removed intervals: " + remove);
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InsertMergreInterval{
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{6,9}};
         int[] newInterval = {2,5};
        int ans[][] = merge(intervals,newInterval);
        
        System.out.println(Arrays.deepToString(ans));
    }

    static int[][] merge(int[][] intervals,  int[] newInterval){
            // Edge case: if no intervals exist, return newInterval directly
        if (intervals.length == 0) {
            return new int[][] { newInterval };
        }

        // List to store all intervals including newInterval
        List<int[]> all = new ArrayList<>();
        all.add(newInterval);

        // Add existing intervals
        for (int[] interval : intervals) {
            all.add(interval);
        }

        // Sort intervals by start time
        Collections.sort(all, Comparator.comparingInt(o -> o[0]));

        // List to store merged intervals
        List<int[]> merged = new ArrayList<>();

        // Initialize start and end using first interval
        int start = all.get(0)[0];
        int end = all.get(0)[1];

        // IMPORTANT FIX: loop should run till all.size(), not intervals.length
        for (int i = 1; i < all.size(); i++) {
            int currStart = all.get(i)[0];
            int currEnd = all.get(i)[1];

            // If intervals overlap, merge them
            if (currStart <= end) {
                end = Math.max(end, currEnd);
            }
            // If no overlap, save previous interval
            else {
                merged.add(new int[]{start, end});
                start = currStart;
                end = currEnd;
            }
        }

        // Add the last interval
        merged.add(new int[]{start, end});

        // Convert list to 2D array and return
        return merged.toArray(new int[merged.size()][]);
    }
}
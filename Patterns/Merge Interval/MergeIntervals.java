import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals{
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int ans[][] = merge(intervals);
        
        System.out.println(Arrays.deepToString(ans));
    }

    static int[][] merge(int[][] intervals){
        // If input is null or empty, return empty 2D array
        if (intervals == null || intervals.length == 0)
            return new int[0][0];

        // Sort intervals by start time
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        // List to store merged intervals
        List<int[]> result = new ArrayList<>();

        // Initialize start and end with first interval
        int start = intervals[0][0];
        int end = intervals[0][1];

        // Traverse remaining intervals
        for (int i = 1; i < intervals.length; i++) {

            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];

            // If intervals overlap, merge them
            if (currStart <= end) {
                end = Math.max(end, currEnd);
            }
            // If no overlap, store previous interval
            else {
                result.add(new int[]{start, end});
                start = currStart;
                end = currEnd;
            }
        }

        // Add the last interval
        result.add(new int[]{start, end});

        // Convert list to 2D array and return
        return result.toArray(new int[result.size()][]);

    }
}
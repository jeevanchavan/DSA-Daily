import java.util.ArrayList;

public class ActivitySelection{
    public static void main(String[] args) {
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};

        // sorted on end basis
        ArrayList<Integer> ans = new ArrayList<>();

        // first activity add
        int maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];

        for(int i=1; i<start.length; i++){
            // check for non-overlapping
            if(start[i] >= lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println(maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}

 // TC: O(n) 
// One loop runs from 1 to n-1

// SC: O(n) 
 // ArrayList 'ans' stores selected activities in worst case
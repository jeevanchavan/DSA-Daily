
import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        int ans[] = getTopEle(nums,k);
        System.out.println(Arrays.toString(ans));
    }

    static int[] getTopEle(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();

        // count freq
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }

        // convert map to LIST
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        // sort the list

        Collections.sort(list,(a,b) -> b.getValue() - a.getValue());

        int[] result = new int[k];
        for(int i=0; i<k; i++){
            result[i] = list.get(i).getKey();
        }

        return result;
    }
}

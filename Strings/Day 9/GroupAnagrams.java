// Given an array of strings strs, group the anagrams together.
//  You can return the answer in any order.

// two common approaches for canonical form (sorting vs frequency array)

// 1st Approach: Sorting Method : T.C -> O(n klogk)
import java.util.*;

// public class GroupAnagrams {
//     public static void main(String[] args) {
//         String[] strs = {"eat","tea","tan","ate","nat","bat"};

//         List<List<String>> result = groupAnagrams(strs);

//         // Print result
//         for(List<String> group : result){
//             System.out.println(group);
//         }
//     }

//     public static List<List<String>> groupAnagrams(String[] strs) {
//         // Map to hold sorted key -> list of anagrams
//         Map<String, List<String>> map = new HashMap<>();

//         for(String s : strs){
//             // Convert to char array and sort
//             char[] chars = s.toCharArray();
//             Arrays.sort(chars);
//             String key = new String(chars);

//             // Add word to the correct group
//             if(!map.containsKey(key)){
//                 map.put(key, new ArrayList<>());
//             }
//             map.get(key).add(s);
//         }

//         // Collect all groups
//         return new ArrayList<>(map.values());
//     }
// }


// 2nd Approach: frequency-count method -> T.C -> (n.k) , S.C -> (n.k)

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> result = groupAnagrams(strs);

        // Print result
        for(List<String> group : result){
            System.out.println(group);
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            // Frequency array for characters
            int[] freq = new int[26];
            for(char c : s.toCharArray()){
                freq[c - 'a']++;
            }

            // Build key from frequency array
            // Example: "eat" -> "1#0#0#...#1#...#1"
            StringBuilder keyBuilder = new StringBuilder();
            for(int count : freq){
                keyBuilder.append(count).append("#"); 
            }
            String key = keyBuilder.toString();

            // Add to map
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}

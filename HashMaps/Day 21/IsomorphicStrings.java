// Time & Space
// Time: O(n) — single pass
// Space: O(1) — since only lowercase letters (or limited charset)

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        boolean ans = isIsomorphic(s,t);
        System.out.println(ans);
    }

    static boolean isIsomorphic(String s, String t){
        if(s.length() != t.length()) return false;

        // Hashmap to to store mapping from s -> t
        HashMap<Character,Character> mapST = new HashMap<>();
        // Hashmap to to store mapping from t -> s
        HashMap<Character,Character> mapTS = new HashMap<>();

        // Traverse both the strings together
        for(int i=0; i<s.length(); i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            // If ch1 is already mapped, check consistency
            if(mapST.containsKey(ch1)){
                if(mapST.get(ch1) != ch2) return false;
            }
            // If ch2 is already mapped, check reverse consistency
            else if(mapTS.containsKey(ch2)){
                if(mapTS.get(ch2) != ch1) return false;
            }
            // Otherwise, create new mapping
            else{
                mapST.put(ch1,ch2);
                mapTS.put(ch2,ch1);
            }
        }
        return true;
    }
}

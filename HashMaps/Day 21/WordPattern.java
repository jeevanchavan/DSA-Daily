// Given a pattern and a string s, find if s follows the same pattern.

// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:

// Each letter in pattern maps to exactly one unique word in s.
// Each unique word in s maps to exactly one letter in pattern.
// No two letters map to the same word, and no two words map to the same letter.

//  Time Complexity: O(n)
//  Space Complexity: O(n)

import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";

        boolean ans = getPattern(pattern,s);
        System.out.println(ans);
    }

    static boolean getPattern(String pattern, String s){
        String[] words = s.split(" ");

        if(pattern.length() != words.length) return false;

        // Mapping from pattern -> words
        HashMap<Character,String> mapPW = new HashMap<>();

        // Mapping from words -> pattern
        HashMap<String,Character> mapWP = new HashMap<>();

        // iterate through the string simultaneously
        for(int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            String word = words[i];
                                                            // Keep in mind This Logic Syntax for mapping
            if(mapPW.containsKey(ch)){
                if(!mapPW.get(ch).equals(word)){
                    return false;
                }
                else{
                    mapPW.put(ch,word);
                }
            }

            if(mapWP.containsKey(word)){
                if(mapWP.get(word) != ch){
                    return false;
                }
                else{
                    mapWP.put(word,ch);
                }
            }
        }
        return true;
    }
}

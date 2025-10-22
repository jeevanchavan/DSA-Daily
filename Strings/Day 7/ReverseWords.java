// BruteForce -> T.C = O(n) and S.C = O(n)

import java.util.ArrayList;
import java.util.List;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String res = getReverseString(s);
        System.out.println(res);  // Output: "blue is sky the"
    }

    static String getReverseString(String s){
        // Edge cases
        if(s == null || s.length() == 0) return "";
        if(s.length() == 1) return s;

        // Step 1: Split words manually
        List<String> words = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c != ' '){
                currentWord.append(c);  // Add character to current word
            } else {
                if(currentWord.length() > 0){  // End of word
                    words.add(currentWord.toString());
                    currentWord.setLength(0);  // Reset for next word
                }
            }
        }

        // Add the last word if there is one
        if(currentWord.length() > 0){
            words.add(currentWord.toString());
        }

        // Step 2: Reverse the list of words
        reverseList(words);

        // Step 3: Join words back into a string
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < words.size(); i++){
            result.append(words.get(i));
            if(i != words.size() - 1){
                result.append(" ");
            }
        }

        return result.toString();
    }

    // Helper function to reverse a List<String>
    static void reverseList(List<String> words){
        int low = 0, high = words.size() - 1;
        while(low < high){
            String temp = words.get(low);
            words.set(low, words.get(high));
            words.set(high, temp);
            low++;
            high--;
        }
    }
}

// Optimal Approach -> In place reverse
// T.C -> O(n)

// public class ReverseWords {
//     public static void main(String[] args) {
//         String s = "the sky is blue";
//         String res = getReverseString(s);
//         System.out.println(res);  // Output: "blue is sky the"
//     }

//     static String getReverseString(String s){
//         // Edge cases
//         if(s == null || s.length() == 0) return "";
//         if(s.length() == 1) return s;

//         s = s.trim();
//         reverseString(s);
//     }
//     static void reverseString(String s){
//         int low = 0;
//         int high = s.length()-1;
//         while(low<high){
//             String temp = s[low];

//         }
//     }
// }

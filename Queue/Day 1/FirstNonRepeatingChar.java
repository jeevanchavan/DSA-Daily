import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingChar {
    
    public static void main(String[] args) {
        String str = "aabccxb";
        findNonRepeating(str);
    }

    // This method prints the first non-repeating character
    // after every character in the stream
    static void findNonRepeating(String str){

        // Frequency array to store count of each character (a-z)
        int[] freq = new int[26];

        // Queue to maintain order of characters
        Queue<Character> q = new LinkedList<>();

        // Traverse each character of the string
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            // Add character to queue
            q.add(ch);

            // Increase frequency of the character
            freq[ch - 'a']++;

            // Remove characters from queue
            // if they are repeating
            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
                q.remove();
            }

            // If queue is empty, no non-repeating character
            if(q.isEmpty()){
                System.out.print(-1 + " ");
            }
            // Else, front of queue is first non-repeating
            else{
                System.out.print(q.peek() + " ");
            }
        }

        System.out.println();
    }
}

/*
⏱ Time Complexity (TC)
O(n)

📦 Space Complexity (SC)
O(1)
Frequency array size is fixed (26).
Queue can store at most n characters, but overall considered linear and acceptable. 
*/
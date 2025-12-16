import java.util.Stack;

public class StringReverse {

    // Function to reverse a string using stack
    static String reverseString(String str) {

        Stack<Character> s = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        // StringBuilder to store reversed string
        StringBuilder result = new StringBuilder("");

        // Pop characters from stack and append
        while (!s.isEmpty()) {
            result.append(s.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "abc";
        String ans = reverseString(s);
        System.out.println(ans);
    }

    /*
     Time Complexity (TC):
     - O(n), where n is length of the string
     - Each character is pushed and popped once

     Space Complexity (SC):
     - O(n), stack stores all characters
    */
}

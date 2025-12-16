import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "([]){}}";

        // Check if the string has valid parentheses
        boolean ans = isValid(str);
        System.out.println(ans);
    }

    // Function to check valid parentheses
    static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        // Traverse each character of the string
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // If opening bracket, push into stack
            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            }
            // If closing bracket
            else {
                // If stack is empty, no matching opening bracket
                if (s.isEmpty()) {
                    return false;
                }

                // Check if top of stack matches current closing bracket
                if ((s.peek() == '(' && ch == ')') ||
                    (s.peek() == '[' && ch == ']') ||
                    (s.peek() == '{' && ch == '}')) {
                    s.pop(); // valid pair found
                } 
                else {
                    return false; // mismatch
                }
            }
        }

        // At the end, stack must be empty
        return s.isEmpty();
    }

    /*
     Time Complexity (TC):
     - O(n), where n is the length of the string
     - Each character is pushed and popped at most once

     Space Complexity (SC):
     - O(n) in worst case (all opening brackets)
     - Stack is used to store brackets
    */
}

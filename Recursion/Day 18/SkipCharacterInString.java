// Skip all occurrences of the character 'a' from the string "abcadef" and print the new string.

public class SkipCharacterInString{
    public static void main(String[] args) {
        skip("","abcadef");
    }
    static void skip(String newStr, String s){
        if(s.isEmpty()){
            System.out.println(newStr);
            return;
        }

        char ch = s.charAt(0);
        if(ch == 'a'){
            skip(newStr, s.substring(1));
        }
        else{
            skip(newStr + ch, s.substring(1));
        }
    }
}
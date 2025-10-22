import java.util.HashMap;

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        String s = "leetcode";
        int ans = getFirstUniqueCharacter(s);
        System.out.println(ans);
    }

    static int getFirstUniqueCharacter(String s){
        HashMap<Character,Integer> map = new HashMap<>();

        // Count Frequences of character
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }
        }

        // traverse the String to check the index
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.get(ch) == 1){
                return i;
            }
        }
        return -1;
    }
}

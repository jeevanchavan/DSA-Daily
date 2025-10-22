public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String s = "jeevvaann";
        removeDuplicate(s,0,new StringBuilder(""),new boolean[26]);
    }

    static void removeDuplicate(String s, int i, StringBuilder newStr, boolean[] map){
        // base case
        if(i == s.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = s.charAt(i);
        if(map[currChar - 'a'] == true){
            // duplicate found
            removeDuplicate(s, i+1, newStr, map);
        }
        else{
            // add
            map[currChar -'a'] = true;
            removeDuplicate(s, i+1, newStr.append(currChar), map);
        }
    }
}

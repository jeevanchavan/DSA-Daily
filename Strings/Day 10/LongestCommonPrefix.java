// Method 1 : Horizontal Scanning -> T.C = O(N*M) -> S.C(1)

public class LongestCommonPrefix{
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String res = getLongestCPrefix(strs);
        System.out.println(res);
    }

    static String getLongestCPrefix(String[] strs){
        //edge case
        if(strs.length == 0) return "";

        // step 1: Take the first string as initial prefix
        String prefix = strs[0];

        // step 2: Loop over all other strings
        for(int i=1; i<strs.length; i++){
            int matchLen = 0;

            // compare character by character
            while(matchLen < prefix.length() && matchLen < strs[i].length() &&
            prefix.charAt(matchLen) == strs[i].charAt(matchLen)){
                matchLen = matchLen+1;
            }

            // shrink prefix
            prefix = prefix.substring(0, matchLen);

            if(prefix.isEmpty()){
                return "";
            }
        }
        return prefix;
    }
}
// Given two strings needle and haystack, return the index of the first occurrence 
// of needle in haystack, or -1 if needle is not part of haystack.

//Brute force approach -> O(n * m)

public class Implement_strStr{
    public static void main(String[] args) {
        String haystack = "a";
        String needle = "a";
        int res = getStr(haystack,needle);
        System.out.println(res);
    }

    static int getStr(String haystack, String needle){
        if(needle.length()>haystack.length()){
            return -1;
        }
        if(needle.length()==0) return 0;
        
        for(int i=0; i<=haystack.length()-needle.length(); i++){
            int j=0;
            while(j<needle.length() && haystack.charAt(i+j) == needle.charAt(j)){
                j++;
            }
            if(j == needle.length()){
                return i;
            }
        }
        return -1;
    }
}
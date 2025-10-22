// Brute Force -> T.C -> O(nlogn)

// import java.util.Arrays;

// public class ValidAnagram {
//     public static void main(String[] args) {
//         String s = "anagram";
//         String t = "gramana";
//         System.out.println(checkAnagram(s,t));
//     }

//     static Boolean checkAnagram(String s, String t){
//         char[] sArr = s.toCharArray();
//         char[] tArr = t.toCharArray();
//         Arrays.sort(sArr);
//         Arrays.sort(tArr);

//         if(Arrays.equals(sArr, tArr)){
//             return true;
//         }
//         return false;
//     }
// }

// T.C -> O(n)
public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "gramana";
        System.out.println(checkAnagram(s,t));
    }

    static Boolean checkAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        int[] arr = new int[26];

        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i) - 'a']++;
        }
        for(int i=0; i<t.length(); i++){
            arr[t.charAt(i) - 'a']--;
        }

        for(int count : arr){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}

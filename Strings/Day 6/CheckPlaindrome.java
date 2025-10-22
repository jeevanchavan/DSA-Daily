// Optimal Approach ->O(n) 
// Two pointers used

//Method 1: It uses extra space 

// public class CheckPlaindrome {
//     public static void main(String[] args) {
//         String str = new String("A man, a plan, a canal: Panama");
//         Boolean res = checkPalin(str);
//         System.out.println(res);
//     }

//     static Boolean checkPalin(String str){
//         // Create new String
//         StringBuilder cleaned = new StringBuilder();
//         for(char c : str.toCharArray()){
//             if(Character.isLetterOrDigit(c)){
//                 cleaned.append(Character.toLowerCase(c));
//             }
//         }

//         int low = 0;
//         int high = cleaned.length() - 1;

//         while(low < high){
//             if(cleaned.charAt(low) != cleaned.charAt(high)){
//                 return false;
//             }
//             low++;
//             high--;
//         }
//         return true;
//     }
// }

//Method 2: It do not uses extra space S.C -> O(1)

public class CheckPlaindrome {
    public static void main(String[] args) {
        String str = new String("A man, a plan, a canal: Panama");
        Boolean res = checkPalin(str);
        System.out.println(res);
    }

    static Boolean checkPalin(String str){
        int low = 0;
        int high = str.length()-1;

        while(low < high){
            // Skip non-alphanumeric from left
            while(low<high && !Character.isLetterOrDigit(str.charAt(low))){
                low++;
            }
            // Skip non-alphanumeric from right
            while(low<high && !Character.isLetterOrDigit(str.charAt(high))){
                high--;
            }

            if(Character.toLowerCase(str.charAt(low)) != Character.toLowerCase(str.charAt(high))){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
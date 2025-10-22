// here we don not used return type.
// We passing arguments and not using the variables in the fun body
//  T.C -> O(2^n * n) && S.C -> O(n)

public class FindSubsets {
    public static void main(String[] args) {
        String str = "abc";
        findSubset(str," ",0);
    }

    static void findSubset(String str, String ans, int i){
        //base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("NULL");
            }
            else{
                System.out.println(ans);
            }
            return;
        }

        // Yes choice
        findSubset(str, ans + str.charAt(i), i+1);
        // No Choice
        findSubset(str, ans, i+1);
    }
}

// Method 2: How to use return type?

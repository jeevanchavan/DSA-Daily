import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        boolean ans = getHappyNumber(n);
        System.out.println(ans);
    }

    static boolean getHappyNumber(int n){
        HashSet<Integer> seen = new HashSet<>();

        while(n != 1){
            if(seen.contains(n)){
                return false;
            }
            seen.add(n);

            n = sumOfSquares(n);
        }

        return true;
    }

    static int sumOfSquares(int num){
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}

public class PowXn{
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        double ans = getPow(x,n);
        System.out.println(ans);
    }

    static double getPow(double x, int n){
        long N = n;

        //base case
        if(N == 0) return 1;

        // Handle negative pow
        if(N < 0){
            x = 1/x;
            N = -N;
        }

        // Calculate half
        double half = getPow(x, (int)(N/2));

        if(N % 2== 0){
            return half*half;
        }
        else{
            return x*half*half;
        }
    }
}

// T.C -> O(logn)
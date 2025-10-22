public class Fibonacci{
    public static void main(String[] args) {
        int n = 5;
        int res = getFibo(n);
        System.out.println(res);
    }

    static int getFibo(int n){
        if(n <= 1) return 1;

        return getFibo(n-1) + getFibo(n-2);
    }
}
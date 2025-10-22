public class TilingProblem {
    public static void main(String[] args) {
        int n =4;
        int ans = placeTiles(n);
        System.out.println(ans);
    }

    static int placeTiles(int n){
        if(n == 0 || n==1) return 1;

        int verticalPlacing = placeTiles(n-1);
        int horizontalPlacing = placeTiles(n-2);
        int totalWays = verticalPlacing + horizontalPlacing;

        return totalWays;
    }
}

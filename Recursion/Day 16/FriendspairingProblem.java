public class FriendspairingProblem {
    public static void main(String[] args) {
        int n = 3;
        int ans = pairFinding(n);
        System.out.println(ans);
    }

    static int pairFinding(int n){
        if(n == 1 || n == 2) return n;

        int single = pairFinding(n-1);
        int paired = (n-1) * pairFinding(n-2);
        int totalWays = single + paired;

        return totalWays;
    }
}

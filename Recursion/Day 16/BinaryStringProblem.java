public class BinaryStringProblem {
    public static void main(String[] args) {
        getBinString(3,0,"");
    }

    static void getBinString(int n, int lastPlace, String str){
        //base case
        if(n == 0){
            System.out.println(str);
            return;
        }

        if(lastPlace == 0){
            getBinString(n-1, 0, str+"0");
            getBinString(n-1, 1, str+"1");
        }
        else{
            getBinString(n-1, 0, str+"0");
        }
    }
}

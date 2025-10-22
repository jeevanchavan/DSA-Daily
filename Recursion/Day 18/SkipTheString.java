public class SkipTheString {
    public static void main(String[] args) {
        System.out.println(skipApple("abcdapplenbn"));
    }
    static String skipApple(String s){
        if(s.isEmpty()){
            return "";
        }

        if(s.startsWith("apple")){
            return skipApple(s.substring(5));
        }
        else{
            return s.charAt(0) + skipApple(s.substring(1));
        }
    }
}

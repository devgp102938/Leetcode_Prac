

public class Palindrom{
    public static boolean isPalindrom(int i, String s){
        if(i >= s.length() / 2){
            return true;
        }

        if(s.charAt(i) != s.charAt(s.length() - i - 1)){
            return false;
        }

        return isPalindrom(i + 1, s);
    }

    public static void main(String[] args) {
        String s =  "madam";

        boolean res = isPalindrom( 0,  s);
        System.err.println(res);
    }
}
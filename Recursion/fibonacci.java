

public class fibonacci{
    public static int fibonnaci(int n){
        if(n <= 1){
            return n;
        }

        return fibonnaci(n - 1) + fibonnaci(n - 2);
    }
    public static void main(String[] args) {
        int n = 5;

        System.err.println(fibonnaci(n));
    }
}

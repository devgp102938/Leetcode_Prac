import java.util.Scanner;

class Fact{
    public int factorial(int n){
        if(n == 0){
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Fact factor = new Fact();

        System.out.println("Enter your number");
        int n = sc.nextInt();

        int res = factor.factorial(n);
        System.err.println(res);
    }
}
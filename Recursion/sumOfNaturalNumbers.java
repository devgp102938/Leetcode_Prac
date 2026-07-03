import java.util.Scanner;

class sumOfNaturalNumbers{
    public int sumOfnaturalnumbers(int n){
        int sum = 0;

        for(int i = 0; i <= n; i++){
            sum += i;
        }

        return sum;
    }

    public int sumOfNumbersWformula(int n){
         return (n * (n+1) ) /2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sumOfNaturalNumbers snn = new sumOfNaturalNumbers();

        System.out.println("Enter your number");
        int n = sc.nextInt();

        int res = snn.sumOfnaturalnumbers(n);
        int res2 = snn.sumOfNumbersWformula(n);

        System.err.println(res);
        System.err.println(res2);
    }
}
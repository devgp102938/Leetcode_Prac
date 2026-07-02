import java.util.*;
class armstrong{
    
    public int Armstrong(int num){
        int len = String.valueOf(num).length();
        int sum = 0;
        int n = num;

        while(n > 0){
            int digit = n % 10;
            sum += Math.pow(digit, len);
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        armstrong arms = new armstrong();

        System.out.println("Enter number 1:");
        int n1 = sc.nextInt();

        int res = arms.Armstrong(n1);
        System.out.println(res + "number is armstrong");
    }
}
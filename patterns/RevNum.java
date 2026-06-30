import java.util.Scanner;

class RevNum{
    public int revNum(int num){
        int rev = 0;

        while(num != 0){
            int digit = num % 10;

            rev = (rev * 10) + digit;

            num /= 10;
        }
        return rev;
    }

     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number");
        int n = sc.nextInt();

        RevNum rv = new RevNum();
        int res = rv.revNum(n);

        System.out.print(res);
    }
}
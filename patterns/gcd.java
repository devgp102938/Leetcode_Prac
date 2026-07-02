import java.util.*;

class gcd{
    public int GCD(int n1, int n2){
        int gcd = 1;

        for(int i = 1; i <= Math.min(n1, n2); i++){
            
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }

        }
        return gcd;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        gcd commandivisor = new gcd();

        System.out.println("Enter number 1:");
        int n1 = sc.nextInt();

        System.out.println("Enter number 2:");
        int n2 = sc.nextInt();



        int res = commandivisor.GCD(n1, n2);

        System.out.print(res);
    }
}
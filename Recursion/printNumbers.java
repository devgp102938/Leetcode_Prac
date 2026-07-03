import java.util.Scanner;


class printNumbers{
    public void printNumbers(int num, int n){ //for 1 to n num > n where num = 1 and n = goal /// for n to 1 num < n where num = goal and n = 1
                                            // recusrion call would be for 1 to n ( n + 1 ) and for n to 1 ( n - 1 )
        if(num < n){
            return;
        }        

        System.err.println(num + " ");

        printNumbers(num - 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printNumbers pn = new printNumbers();

        System.out.println("Enter your number");
        int n = sc.nextInt();

        pn.printNumbers(n, 1);
    }
}
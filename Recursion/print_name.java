
import java.util.Scanner;


class print_name{

    public void PrintName(int num){

        if(num == 0)
        {
            return;
        }

        System.err.println("DEV");

        PrintName(num - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number");
        int n = sc.nextInt();

        print_name pn = new print_name();

        pn.PrintName(n);
    }
}
import java.util.Scanner;

class Rec_PrintNnum{

    public int PrintNnum(int num){

        if(num == 0){
            return 0;
        }

        System.out.println(num);

        PrintNnum(num - 1);

        return 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number");
        int n = sc.nextInt();

        Rec_PrintNnum obj = new Rec_PrintNnum();

        int res = obj.PrintNnum(n);
        System.out.println(res);
    }
}

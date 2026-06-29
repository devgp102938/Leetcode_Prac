import java.util.Scanner;

class pattern9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            //space
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            //start
            for(int j = 0; j < 2 * i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++){
            //space
            for(int j = 0; j < i ; j++){
                System.out.print(" ");
            }
            //star
            for(int j = 0; j < 2 * (n - i ) - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;

class pattern19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num");
        int n = sc.nextInt();


        int space = 0;
        for(int i = 0; i < n; i++){
            //start
            for(int j = 0; j < n - i; j++){
                System.out.print("*");
            }
            //space
            for(int j = 0; j < space; j++){
                System.out.print(" ");
            }
            //star
            for(int j = 0; j < n - i; j++){
                System.out.print("*");
            }
            System.out.println("");
            space += 2;
        }
        int space2 = 8;
        for(int i = 0; i < n; i++){
            //start
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            //space
            for(int j = 0; j < space2; j++){
                System.out.print(" ");
            }git restore patterns
            //star
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
            space2 -= 2;
        }
    }
}
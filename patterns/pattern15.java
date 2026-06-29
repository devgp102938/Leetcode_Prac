import java.util.Scanner;

class pattern15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num");
        int n = sc.nextInt();

        for(int i = n; i > 0; i--){
            for(char ch = 'A'; ch < 'A' + i; ch++){
                System.out.print(ch);
            }
            System.out.println("");
        }

    }
}
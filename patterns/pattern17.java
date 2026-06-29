import java.util.Scanner;

class pattern17{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }

            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for(int j = 0; j < 2*i + 1; j++){
                System.out.print(ch);
                if(j < breakpoint){
                    ch++;
                }
                else{
                    ch--;
                }
                
            }
            System.out.println();

        }

    }
}
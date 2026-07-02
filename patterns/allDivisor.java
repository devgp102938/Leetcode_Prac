import java.util.*;
class allDivisor{
    
    public int AllDivisor(int num){

        int[] arr = new int[num];
        int count = 0;

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                arr[count] = i;
                count++;
            }
        }

        System.out.print("all divisior are");
        for(int i = 0; i < count; i++){
            System.out.println("  " + arr[i]);
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int n1 = sc.nextInt();

        allDivisor AD = new allDivisor();

        AD.AllDivisor(n1);
    }
}
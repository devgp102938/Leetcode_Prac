import java.util.*;

class second_large{
    public static void second_large(int[] arr){
        int n = arr.length;
        int max = 0;
        int second_max = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                second_max = max;
                max = arr[i];
            }
            else if(arr[i] > second_max && arr[i] != max){
                second_max = arr[i];
            }
        }

        System.out.println("Second max" + second_max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ENter num:");
        int n = sc.nextInt();
        
        System.out.println("ENter array num:");
        int[] arr = new int[n];
        for(int i  =0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        second_large(arr);
    }
}
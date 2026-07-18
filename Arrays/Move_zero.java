import java.util.Scanner;

class Move_zero{
    public static void movezero(int[] arr){
        int n = arr.length;
        int j = -1;

        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }

        if(j == -1){
            return;
        }

        for(int i = j + 1; i < n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elemets for array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        movezero(arr);
    }
}
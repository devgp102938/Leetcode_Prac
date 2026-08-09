import java.util.*;

class reverse_arrayby_k{
    public void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void reverseArr(int[] arr, int k){
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        System.out.println("Enter num: ");
        int n = sc.nextInt();

        System.out.println("Enter element of arrays: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        reverse_arrayby_k rabk = new reverse_arrayby_k();

        rabk.reverseArr(arr, k);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
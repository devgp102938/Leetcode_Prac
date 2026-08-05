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

        reverse_arrayby_k obj = new reverse_arrayby_k();

        System.out.println("Enter rotation value:");
        int k = sc.nextInt();

        System.out.println("ENter number: ");
        int n = sc.nextInt();

        System.out.println("Enter array element:");
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        obj.reverseArr(arr, k);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
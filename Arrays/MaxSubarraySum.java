import java.util.*;

class MaxSubarraySum{
    public int MaxSubarraysum(int[] arr){

        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
              sum += arr[j];
              max = Math.max(max, sum);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MaxSubarraySum mss = new MaxSubarraySum();

        System.out.println("Enter num:");
        int n = sc.nextInt();

        System.out.println("Enter Array element: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Result : " + " " + mss.MaxSubarraysum(arr));
    }
}
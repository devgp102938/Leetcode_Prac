import java.util.*;

class longestSubarray {

    public int longestsubarray(int[] arr, int k) {

        // *** BRUTE FORCE *** //

        // int len = arr.length;

        // int max = 0;

        // for(int i = 0; i < len; i++){
        //     int currSum = 0;
        //     for(int j = i; j < len; j++){
                
        //         currSum += arr[j];

        //         if(currSum == k){
        //             max = Math.max(max, j - i + 1);
        //         }
        //     }
        // }

        // return max;

        int n = arr.length;

        int maxlen = 0;

        int left = 0, right = 0;

        int sum = arr[0];

        while(right < n){

            // check if sum is greater than k
            if(left <= right && sum > k){
                sum -= arr[left];
                left++;
            }

            // Update max length if sum equals k
            if(sum == k){
                maxlen = Math.max(maxlen, right - left + 1);
            }

            //add right in sum
            right++;
            if(right < n){
                sum += arr[right];
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        longestSubarray ls = new longestSubarray();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Result = " + ls.longestsubarray(arr, k));
    }
}
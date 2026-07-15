import java.util.Scanner;

class Solution{
    public int Second_Min(int[] arr){
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] < min){
                second_min = min;
                min = arr[i];
            }
            else if(arr[i] < second_min && arr[i] != min){
                second_min = arr[i];
            }
        }
        if(second_min == Integer.MAX_VALUE) {
            return -1; // No second minimum exists
        }
        return second_min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Solution sm = new Solution();

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int res = sm.Second_Min(arr);
        System.out.println("Result" + res);
    }
}
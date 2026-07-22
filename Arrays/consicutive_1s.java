import java.util.*;

class consicutive_1s{
    public int consecutiveOnes(int[] arr){
        int n = arr.length;
        int count = 0;
        int maxCount = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                count++;
                maxCount = Math.max(count, maxCount);
            }
            else{
                count = 0;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        consicutive_1s c1 = new consicutive_1s();

        System.out.println("Enter num:");
        int n  = sc.nextInt();

        System.out.println("Enter array elements: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter Element no" + "[" + i + "]:");
            arr[i] = sc.nextInt();
        }

        int res = c1.consecutiveOnes(arr);

        System.out.println("max streak of 1 is: " + res);
    }
}
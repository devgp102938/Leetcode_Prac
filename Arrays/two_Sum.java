import java.util.*;

class two_Sum{

    public int[] Two_sum(int[] arr, int target){
        int n = arr.length;

        // !!BRUTE!!
        // for(int i = 0; i < n; i++){
        //     for(int j = i + 1; j < n; j++){
        //         if(arr[i] + arr[j] == target){
        //             return new int[]{i, j};
        //         }
        //     }
        // }

        //!!HASHMAP!!

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }

            map.put(arr[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        two_Sum TS = new two_Sum();

        System.out.println("Enter Num:");
        int n = sc.nextInt();

        System.out.println("Enter array nums:");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter targtet element:");
        int target = sc.nextInt();

        int[] arr2 = TS.Two_sum(arr, target);

        System.out.println("Result: [" + arr2[0] + "," + arr2[1] + "]");
        
    }
}
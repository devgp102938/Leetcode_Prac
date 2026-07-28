import java.util.*;

class Majority_element{
    public int MajorElement(int[] arr){
        // int n = arr.length;
        // int target = n / 2;

        // int max = 0;
        // for(int i = 0; i < n; i++){
        //     max = Math.max(max, arr[i]);
        // }

        // int[] hash = new int[max + 1];

        // for(int i = 0; i < n; i++){
        //     hash[arr[i]]++;
        // }

        // for(int i = 0; i < n; i++){
        //     if(hash[arr[i]] >target){
        //         return arr[i];
        //     }
        // }

        // return -1;

        // !! OPTIMAL !! //

        int n = arr.length;
        int target = n/2;
        int element = 0;
        int count = 0;

        for(int i = 0; i < n; i++){
            if(count == 0){
                count = 1;
                element = arr[i];
            }
            else if(count == element){
                count++;
            }
            else{
                count--;
            }
        }

        int count1 = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == element){
                count1++;
            }
        }
        if(element > target){
            return element;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Majority_element ME = new Majority_element();

        System.out.println("Enter num:");
        int n = sc.nextInt();

        System.out.println("Enter array element:");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("result" + " " + ME.MajorElement(arr));
    }
}
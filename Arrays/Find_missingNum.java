import java.util.*;

class Find_missingNum{
    
    public int missingnum(int[] arr){
        // int n = arr.length + 1;

        // for(int i = 1; i <= n; i++){
        //     boolean found = false;
        //     for(int j = 0; j < n - 1; j++){
        //         if(arr[j] == i){
        //             found  = true;
        //             break;
        //         }
        //     }
        //     if(!found){
        //         return i;
        //     }
        // }
        // return -1;

        // int n = arr.length + 1;

        // int[] hash = new int[n + 1];

        // for(int i = 0; i < n - 1; i++){
        //     hash[arr[i]]++;
        // }

        // for(int i = 1; i <= n; i++){
        //     if(hash[i] == 0){
        //         return i;
        //     }
        // }

        // return -1;

        int n = arr.length + 1;

        long sum = 0;
        for(int i = 0; i < n - 1; i++){
            sum += arr[i];
        }

        long exp = n * (n + 1) / 2;

        return (int)(exp - sum);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        Find_missingNum fmn = new Find_missingNum();

        System.out.println("Emter num:");
        int n = sc.nextInt();

        System.out.println("Enter array element:");
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int res = fmn.missingnum(arr);

        System.out.println("result : " + res);
    }

}
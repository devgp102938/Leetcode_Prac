import java.util.*;

class sort1s2s3s{
    public void Sort1s2s3s(int[] arr){

                //**BRUTE**//
        // int count0 = 0, count1 = 0, count2 = 0;

        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] == 0){ count0++; }
        //     else if(arr[i] == 1){ count1++; }
        //     else{ count2++; }
        // }

        // for(int i = 0; i < count0; i++){
        //     arr[i] = 0;
        // }

        // for(int i = count0; i < count0 + count1; i++){
        //     arr[i] = 1;
        // }

        // for(int i = count0 + count1; i < arr.length; i++){
        //     arr[i] = 2;
        // }


            //**OPTIMAL**//
        int n = arr.length;

        int low = 0;
        int mid = 0;
        int high = n - 1;

        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sort1s2s3s sort123 = new sort1s2s3s();

        System.out.println("Enter num:");
        int n = sc.nextInt();

        System.out.println("Enter array element:");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        sort123.Sort1s2s3s(arr);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
import java.util.Scanner;

class is_ArraySorted{
    
    public boolean is_arraysorted(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            if(arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
        // for(int i = 0; i < n; i++){
        //     for(int j = i + 1; j < n; j++){
        //         if(arr[i] > arr[j]){
        //             return false;
        //         }
        //     }
        // }
        // return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        is_ArraySorted ias = new is_ArraySorted();
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        boolean res = ias.is_arraysorted(arr);

        System.err.println("Result" + res);
    }
}
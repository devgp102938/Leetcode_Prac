import java.util.Scanner;

class Selection_Sort{

    public void selection_sort(int arr[], int n){

        for(int i = 0; i <= n - 2; i++){
            int min = i;
            for(int j = i; j <= n - 1; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp; 
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Selection_Sort ss = new Selection_Sort();

        System.out.println("Enter number");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        ss.selection_sort(arr, n);
    }
}


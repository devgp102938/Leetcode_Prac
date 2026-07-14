import java.util.Scanner;

class QuickSort{

        public int partitionHoare(int arr[], int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        
        while(i  < j){
            while(arr[i] <= pivot && i <= high - 1){
                i++;
            }
            while(arr[j] > pivot && j >= low - 1){
                j--;
            }
            if( i < j ){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
    public int partitionLomuto(int arr[], int low, int high){
        int pivot = arr[high];

        int i = low - 1;

        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    public void QS(int arr[], int low, int high, int choice){

        if( low < high){
            int pIndex = 0;

            switch (choice) {
                case 1:
                    pIndex = partitionHoare(arr, low, high);
                    break;
                case 2:
                    pIndex = partitionLomuto(arr, low, high);
                    break;
                default:
                    System.err.println("Invalid choice");
                    return;
            }

            QS(arr, low, pIndex - 1, choice);
            QS(arr, pIndex + 1, high, choice);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuickSort qs = new QuickSort();

        System.err.println("Enter number:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enetr your choice");
        System.out.println("1. Pivot first ");
        System.out.println("2. Pivot last");
        int choice = sc.nextInt();

        qs.QS(arr, 0, arr.length - 1,choice);

        System.err.println("After sorting");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
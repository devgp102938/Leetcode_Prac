import java.util.Scanner;

class insertionSort{
    public int[] insertionsort(int arr[], int n){
        for(int i = 1; i < n; i++){
            int curr = arr[i];
            int prev = i - 1;

            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        insertionSort isort = new insertionSort();

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        isort.insertionsort(arr, n);

        System.out.println("After Using Insertion Sort: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
import java.util.Scanner;

class Bubble_Sort{
    public void Bubble_sort(int arr[], int n){
        for(int i = n - 1; i >= 1; i--){
            for(int j = 0; j <= i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bubble_Sort bs = new Bubble_Sort();

        System.out.println("Enter number");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        bs.Bubble_sort(arr, n);
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MergeSort{

    public void merge(int arr[], int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high){
            if(arr[left] < arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }

        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        for(int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }

    }

    public void mergesort(int arr[], int low, int high){
        if(low >= high){ return; }

        int mid = (low + high) / 2;

        mergesort(arr, low, mid);
        mergesort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MergeSort mg = new MergeSort();
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        mg.mergesort(arr, 0, n - 1);

        for(int i = 0;i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
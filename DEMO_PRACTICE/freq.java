
import java.util.Scanner;


class freq{
    public static void freq_count(int[] arr){
        int n = arr.length;

        int maxi = 0;
        for(int i = 0; i < n; i++){
            maxi = Math.max(maxi, arr[i]);
        }

        int[] hash = new int[maxi + 1];

        for(int i = 0; i < n; i++){
            hash[arr[i]]++;
        }

        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + " -> "+ hash[arr[i]] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num:");
        int n = sc.nextInt();

        System.out.println("Enter array elements");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        freq_count(arr);
    }
}

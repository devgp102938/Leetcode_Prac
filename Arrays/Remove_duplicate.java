import java.util.Scanner;

class Remove_duplicate{
    public int Remove(int[] arr){
        int n = arr.length;

        int k = 1;

        for(int i = 1; i < n; i++){
            if(arr[i] != arr[k - 1]){
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Remove_duplicate rd = new Remove_duplicate();

        System.out.println("Enter num");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int res = rd.Remove(arr);

        System.out.println("Total number of unique elements are" + res);
    }   
}
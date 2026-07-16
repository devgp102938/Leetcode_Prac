import java.util.Scanner;

class rotate_array{
    public void solve(int[] arr){
        int temp = arr[0];

        for(int i = 1; i < arr.length; i++){
            arr[i - 1 ] = arr[i];
        }

        arr[arr.length - 1] = temp;

        System.out.print("Rotated array");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        rotate_array ra = new rotate_array();

        System.out.println("Enter num");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        ra.solve(arr);
    }
}
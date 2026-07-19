import java.util.Scanner;

class linear_search{
    public static int ls(int[] arr, int target){
        

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num:");
        int n = sc.nextInt();
        System.out.println("Enter target num:");
        int target = sc.nextInt();
        System.err.println("Enter Array elemets:");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int res = ls(arr, target);
        if(res != -1){
            System.out.println("index of target" + " " + res);
        }
        else{
            System.out.println("Element not in array");
        }
    }
}  
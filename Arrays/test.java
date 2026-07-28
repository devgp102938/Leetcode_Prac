import java.util.*;

class test{
    public static int solution(int[] arr){
        int n = arr.length;

        int max = 0;
        for(int i = 0; i < n; i++){
            max = Math.max(max, arr[i]);
        }

        int[] hash = new int[max + 1];
        for(int i = 0; i < n; i++){
            hash[arr[i]]++;
        }

        for(int i = 0; i < n; i++){
            if(hash[arr[i]] == 1){
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num:");
        int n = sc.nextInt();

        System.out.println("Enter array element:");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("result" + " " + solution(arr));
    }
}
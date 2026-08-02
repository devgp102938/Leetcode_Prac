
import java.util.HashMap;
import java.util.Scanner;


class freq_hashmap{
    public static void freq_count(int[] arr){
        int n = arr.length;

        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else{
                mp.put(arr[i], 1);
            }
        }

        for(int i = 0; i < n; i++){
            if(mp.containsKey(arr[i])){
                System.out.println(arr[i] + " -> " + mp.get(arr[i]) + " ");
                mp.remove(arr[i]);
            }
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

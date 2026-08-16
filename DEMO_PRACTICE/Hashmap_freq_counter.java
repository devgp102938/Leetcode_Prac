import java.util.*;

class Hashmap_freq_counter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num:");
        int n = sc.nextInt();

        System.out.println("Enter array elements: ");
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else{
                mp.put(arr[i], 1);
            }
        }

        System.out.println("Result : " + mp);
    }
}
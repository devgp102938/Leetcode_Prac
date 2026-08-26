import java.util.*;

class find_dup_set{
    public int findDup(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            if(set.contains(arr[i])){
                return arr[i];
            }
            else{
                set.add(arr[i]);
            }
        }

        return 0
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        find_dup_set fds = new find_dup_set();

        System.out.println("Enter Num: ");
        int n = sc.nextInt();
        
        System.out.println("Enter array element: ");
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int result = fds.findDup(arr);

        System.out.println("Result: " + result);

    }
}
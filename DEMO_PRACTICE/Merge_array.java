import java.util.*;

class Merge_array{
    public HashSet<Integer> Merge(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int i = 0; i < arr2.length; i++){
            set.add(arr2[i]);
        }

        return set;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Merge_array ma = new Merge_array();

        System.out.println("Enter arr1 size and elements:");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter arr2 size and elements");
        int m = sc.nextInt();
        int[] arr2 = new int[m];  
        for(int i = 0; i < m; i++){
            arr2[i] = sc.nextInt();
        }

        HashSet<Integer> result = ma.Merge(arr1, arr2);

        System.out.print(result);
    }
}


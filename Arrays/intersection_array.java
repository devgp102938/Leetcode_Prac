import java.util.*;

class intersection_array{

    public List<Integer> Intersection(int[] arr1, int[]arr2, int n, int m){
        // //Brute force
        // List<Integer> result = new ArrayList<>();
        // boolean[] visited = new boolean[m];

        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < m; j++){
        //         if(arr1[i] == arr2[j] && !visited[j]){
        //             result.add(arr1[i]);
        //             visited[j] = true;
        //             break;
        //         }
        //     }
        // }

        // return result;


        //two pointer
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        List<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i < n && j < m){

            if(arr1[i] == arr2[j]){
                result.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        intersection_array ia = new intersection_array();

        System.err.println("Enter num1:");
        int n = sc.nextInt();
        System.err.println("Enter num2:");
        int m = sc.nextInt();   

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        System.err.println("Enter Elements for arr1:");
        for(int i = 0; i < n; i ++){
            arr1[i] = sc.nextInt();
        }
        System.err.println("Enter Elements for arr2:");
        for(int i = 0; i < m; i ++){
            arr2[i] = sc.nextInt();
        }

        List<Integer> intersection = ia.Intersection(arr1, arr2, n, m);

        System.out.println("Intersection of two array" + intersection);
    }

}
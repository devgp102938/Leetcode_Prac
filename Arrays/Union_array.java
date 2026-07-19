import java.util.*;


class Union_array{
    public List<Integer> findUnion(int[] arr1, int[] arr2, int n, int m){
        Set<Integer> st = new TreeSet<>();

        for(int i = 0; i < n; i++){
            st.add(arr1[i]);
        }

        for(int i = 0; i < m; i++){
            st.add(arr2[i]);
        }

        return new ArrayList<>(st);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Union_array ua = new Union_array();

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

        List<Integer> union = ua.findUnion(arr1, arr2, n, m);

        System.out.println("Union of arrays:");
        System.out.println(union);

    }
}
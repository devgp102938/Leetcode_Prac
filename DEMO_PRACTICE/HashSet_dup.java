import java.util.*;

class HashSet_dup{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = sc.nextInt();

        System.out.println("Enter Array Element: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> UniqueElements = new HashSet<>();

        for(int i = 0; i < n; i++){
            if(UniqueElements.add(arr[i]));
        }

        System.out.println("Result" + UniqueElements);
    }
}
import java.util.*;

class Largest_element{

    public int Large_element(int[] arr){
        Arrays.sort(arr);

        return arr[arr.length - 1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Largest_element LGE = new Largest_element();

        System.out.println("Enter number");
        int n = sc.nextInt();   
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int res = LGE.Large_element(arr);

        System.out.println("Largest ELement");
        System.out.println(res);
  }
}
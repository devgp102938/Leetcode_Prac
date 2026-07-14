import java.util.*;

class Largest_element{

    public int Large_element(int[] arr){
        int max = arr[0];

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] > arr[i]){
                    max = arr[j];
                }
            }
        }
        return max;
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
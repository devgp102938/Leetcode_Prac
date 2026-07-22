import java.util.*;

class getSingleElement{
    public int GetSingleElement(int[] arr){
        int n = arr.length;

        int maxi = 0;
        for(int i = 0; i < n; i++){
            maxi = Math.max(maxi, arr[i]);
        }

        int[] hash = new int[n];

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

        getSingleElement gse = new getSingleElement();

        System.out.println("Enter num:");
        int n  = sc.nextInt();

        System.out.println("Enter array elements: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter Element no" + "[" + i + "]:");
            arr[i] = sc.nextInt();
        }

        int res = gse.GetSingleElement(arr);

        System.out.println("result" + res);
    }
}
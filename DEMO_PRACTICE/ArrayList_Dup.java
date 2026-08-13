import java.util.*;

class Arraylist_dup{

    public ArrayList<Integer> find_dup(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Arraylist_dup dup = new Arraylist_dup();

        System.out.println("Enter num:");
        int n = sc.nextInt();

        System.out.println("Enter array element");
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> result = dup.find_dup(arr);

        System.out.println("Result");   
        for(int i = 0; i < result.size(); i++){
            System.out.print(result.get(i) + " ");
        }

    }
}
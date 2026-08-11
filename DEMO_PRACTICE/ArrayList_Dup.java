import java.util.*;

class ArrayList_Dup{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num: ");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();

            if(!list.contains(num)){
                list.add(num);
            }
        }

        System.out.println("Result: ");
        System.out.print(list);
    }
}
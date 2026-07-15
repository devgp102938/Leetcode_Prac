import java.util.Scanner;

class Second_Max{
    public int Second_MAX(int[] arr){
        int n = arr.length;
        int max = 0;
        int second_max = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                second_max = max;
                max = arr[i];
            }
            else if(arr[i] > second_max && arr[i] != max){
                second_max = arr[i];
            }
        }
        return second_max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Second_Max sm = new Second_Max();

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int res = sm.Second_MAX(arr);
        System.out.println("Result" + res);
    }
}
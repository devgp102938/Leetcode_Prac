import java.util.Scanner;

class CountNum{
    public int countNum(int[] nums){
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            count++;
        }

        return count;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of array");
        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt(); 
        }    

        CountNum cn = new CountNum();

        int ans = cn.countNum(nums);
        System.out.println(ans);
    }
}
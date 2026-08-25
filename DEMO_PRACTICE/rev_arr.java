class rev_arr{
    public static void main(String[] args) {
        int[] arr = {1, 4, 6 , 7, 2, 3};

        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        
        System.out.println("Reversed: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
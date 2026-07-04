
class revarr{

public void RevArr(int[] arr){
    reverse(arr, 0, arr.length - 1);
}

    private void reverse(int[] arr, int p1, int p2){

        if(p1 >= p2){
            return;
        }
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
        
            reverse(arr, p1+1, p2-1);
        
    }

    public static void main(String[] args) {
        revarr ra = new revarr();

        int[] arr = {2, 4 , 7, 8, 9};

        ra.RevArr(arr);

        for(int i = 0; i < arr.length; i++){
            System.err.print(arr[i]);
        }
    }
}
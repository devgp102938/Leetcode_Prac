
class revarr{
    public void RevArr(int[] arr){

        int p1 = 0;
        int p2 = arr.length - 1;

        while(p1 < p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
        
            p1++;
            p2--;
        }
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
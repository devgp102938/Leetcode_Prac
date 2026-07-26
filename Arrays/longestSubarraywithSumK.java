import java.util.*;

class longestSubarraywithSumK{

    public int longestsubarraywithsumK(int[] arr, int k){
        int n = arr.length;

        int maxlen = 0;

        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += arr[i];

            if(sum == k){
                maxlen += 1;
            }

            if(map.containsKey(sum - k)){
                maxlen = Math.max(maxlen, i - map.get(sum - k));
            }

            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }

        return maxlen;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 1, 1, 1, 1};

        int k = 6;

        longestSubarraywithSumK lswsk = new longestSubarraywithSumK();

        System.out.println("result" + " " + lswsk.longestsubarraywithsumK(arr, k));
    }

}
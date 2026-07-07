import java.util.*;

class Hash_char{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        //precomputing
        int[] hash = new int[25]; 
        for(int i = 0; i < s.length(); i++){
            hash[s.charAt(i) - 'a']++;
        }

        int q = sc.nextInt();
        while(q-- > 0){
            char c = sc.next().charAt(0);
            //fetching
            System.err.println(hash[c - 'a']);
        }
    }
}
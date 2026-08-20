import java.util.*;

class Non_rep_char{
    public static String rep_char(String str) {

        HashMap<String, Integer> mp = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            String ch = str.charAt(i) + " ";
            if(mp.containsKey(ch)){
                mp.put(ch, mp.get(ch) + 1);
            }
            else{
                mp.put(ch, 1);
            }
        }

        for(int i = 0; i < str.length(); i++){
            String ch = str.charAt(i) + " ";
            if(mp.get(ch) == 1){
                return ch;
            }
        }

        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        String result = rep_char(str);

        System.out.println("Result : " + result);
    }
}
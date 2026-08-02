import java.util.*;

class reverse_string{
    public static String reverse_str(String str){

        String New_string = "";

        for(int i = str.length() - 1; i >= 0; i--){
            New_string += str.charAt(i);
        }

        return New_string;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        String result = "";

        for(int i = 0; i < words.length; i++){
            result += reverse_str(words[i]);

            if(i != words.length - 1){
                result += " ";
            }
        }

        System.out.println("Result : " + " " + result);
    }
}
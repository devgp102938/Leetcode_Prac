class demo{
    public int numOfString(String[] patterns, String word){
        int count = 0;

        for(int i = 0; i < patterns.length; i++){
            if(word.contains(patterns[i])){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args){

        demo d1 = new demo();

        String[] patterns = {"a","a","a"};
        String word = "ab";

        int result = d1.numOfString(patterns, word);
        System.out.println(result);
        
    }
}


import java.util.Scanner;

class primeNum{
    
    public void isPrime(int num){

        int count = 0;

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                count++;
            }
        }

        if(count == 2){
            System.out.println(num + "is prime");
        }
        else{
            System.out.println(num + "is not prime");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        primeNum Prime = new primeNum();

        System.out.println("Enter number:");
        int n1 = sc.nextInt();

        Prime.isPrime(n1);
        
    }
}
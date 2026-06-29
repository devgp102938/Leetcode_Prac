import java.util.Scanner;

class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Enter num");
        int n = sc.nextInt();
    }
}
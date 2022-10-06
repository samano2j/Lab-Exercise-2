import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        int sum = 0;

        System.out.println("Input the N:");
        n = scan.nextInt();
        
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        

        System.out.println("The sum of 1 to " + n + " is " + sum);

        scan.close();
    }
}

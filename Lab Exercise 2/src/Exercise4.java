import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int n = 0;

        System.out.println("How many integers will be added? ");
        count = scan.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("Enter an integer: ");
            n = scan.nextInt();
            sum += n;
        }

        System.out.println("\nThe sum is " + sum);
        
        scan.close();
    }
}

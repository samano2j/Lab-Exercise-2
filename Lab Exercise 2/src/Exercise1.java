import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = 0;
        int end = 0;

        System.out.println("Input the start:");
        start = scan.nextInt();

        System.out.println("Input the End:");
        end = scan.nextInt();
        System.out.println("\n");

        while (start <= end) {
            System.out.println(start);
            start++;
        }

        scan.close();
    }
}

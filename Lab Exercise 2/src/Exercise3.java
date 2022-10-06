import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "";

        System.out.println("Enter a word: ");
        str = scan.next();
        System.out.println("\n");
        
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str);
        }

        scan.close();
    }
}

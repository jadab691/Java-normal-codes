
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        int n, fact = 1;
        System.out.println("Enter a number to find its factorial :");
        
        Scanner r = new Scanner(System.in);
        n = r.nextInt();

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("The factorial is = " + fact);
    }
}

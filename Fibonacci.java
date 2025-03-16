
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        int n;
        System.out.println("Enter n'th term to find the FIbonacci series  :");

        Scanner r = new Scanner(System.in);
        n = r.nextInt();

        int a = 0, b = 1, c;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(" ");
    }
}


import java.util.Scanner;

public class Prime_or_notPrime {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number to find weather its prime or not :");

        Scanner r = new Scanner(System.in);
        n = r.nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count > 2) {
            System.out.println("NOT PRIME");
        } else {
            System.out.println(" PRIME ");
        }
    }
}

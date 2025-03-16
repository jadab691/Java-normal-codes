
import java.util.Scanner;

public class MaxNum {

    public static void main(String[] args) {

        int n;

        System.out.println("Enter how many numbers you want to compare :");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();

        int arr[] = new int[n];

        System.out.println("enter the numbers :");

        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt();
        }
        int mexi = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                mexi = arr[i];
            }
        }

        System.out.println("The max number is " + mexi);

    }
}

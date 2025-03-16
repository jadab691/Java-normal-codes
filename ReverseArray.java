
import java.util.*;

public class ReverseArray {

    public static void main(String[] args) {

        System.out.println("Enter the size of the array :");

        Scanner r = new Scanner(System.in);
        int n = r.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the " + n + " elements of the array :");

        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt();
        }

        System.out.println("The reverse array is :");

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}


import java.util.Scanner;

public class ArrayUtility {

    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size  and the elements of the array ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

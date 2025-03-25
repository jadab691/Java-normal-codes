
import java.util.Scanner;

class ArrayUtility {

    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}

class minMaxArray {

    public static void main(String[] args) {
        System.out.println("Welcome to Min & Max array element finder");
        int[] myArr = ArrayUtility.inputArray();

        int max = max(myArr);
        int min = min(myArr);

        System.out.println("Max of the array is: " + max);
        System.out.println("Min of the array is: " + min);
    }

    public static int min(int[] myArr) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < myArr.length) {
            if (min > myArr[i]) {
                min = myArr[i];
            }
            i++;
        }
        return min;
    }

    public static int max(int[] myArr) {
        if (myArr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int i = 0;
        int max = myArr[0];

        while (i < myArr.length) {
            if (max < myArr[i]) {
                max = myArr[i];
            }
            i++;
        }
        return max;
    }
}

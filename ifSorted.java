
import java.util.Scanner;

class ArrayUtility {

    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of elements and the elements of the array ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }
}

class ifSorted {

    public static void main(String[] args) {
        int[] myArr = ArrayUtility.inputArray();
        boolean isInc = isIncressing(myArr);
        boolean isDec = isDecressing(myArr);

        if (isInc || isDec) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }

    public static boolean isIncressing(int[] myArr) {
        for (int i = 1; i < myArr.length; i++) {
            if (myArr[i - 1] > myArr[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDecressing(int[] myArr) {
        for (int i = 1; i < myArr.length; i++) {
            if (myArr[i - 1] < myArr[i]) {
                return false;
            }
        }
        return true;
    }
}

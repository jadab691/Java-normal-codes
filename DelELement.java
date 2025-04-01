
import java.util.Scanner;

public class DelELement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the array element deleter program");

        // Taking input array using ArrayUtility class
        int[] numArr = ArrayUtility.inputArray();

        // Asking the user for the element to delete
        System.out.println("Enter the element you want to delete from the array: ");
        int numToDelete = input.nextInt();

        // Calling the delete method
        int[] newArr = deletNumber(numArr, numToDelete);

        // Printing the new array
        System.out.println("The new array after deletion is: ");
        ArrayUtility.printArray(newArr);
    }

    public static int[] deletNumber(int[] numArr, int numToDelete) {
        int count = 0;

        // Count occurrences of numToDelete
        for (int num : numArr) {
            if (num == numToDelete) {
                count++;
            }
        }

        // If number not found, return original array
        if (count == 0) {
            System.out.println("Element not found in array!");
            return numArr;
        }

        // Create new array with a smaller size
        int[] newArr = new int[numArr.length - count];
        int index = 0;

        for (int num : numArr) {
            if (num != numToDelete) {
                newArr[index++] = num;
            }
        }

        return newArr;
    }
}

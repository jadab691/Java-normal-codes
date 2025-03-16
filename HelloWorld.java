
import java.util.*;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World");
        int i = 10;
        float f = 100000.4566f;
        double d = 10.4;
        char ch = 'h';
        String s = "hey dudes hows days going ?";

        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
        System.out.println(ch);
        System.out.println(s);
        //  sum of two array .............................................................................
        Scanner input = new Scanner(System.in);

        int arr_1[] = new int[5];
        int arr_2[] = new int[5];
        System.out.println("Enter 5 elements for arr_1 :");
        for (int j = 0; j < 5; j++) {
            arr_1[j] = input.nextInt();
        }
        System.out.println("Enter 5 elements for arr_2 :");
        for (int j = 0; j < 5; j++) {
            arr_2[j] = input.nextInt();
        }
        System.out.println(" ");
        int[] sum_arr = new int[5];
        int sum = 0;
        System.out.print("The sum is = ");
        for (int j = 0; j < sum_arr.length; j++) {
            sum_arr[j] = (arr_1[j] + arr_2[j]);
        }
        for (int j = 0; j < sum_arr.length; j++) {
            System.out.print(sum_arr[j] + " ");
            sum += sum_arr[j];
        }
        System.out.println(" ");
        System.out.println("The total sum is = " + sum);
        // //take user input ...................................................................
        System.out.println("Enter a int number = ");
        int x = input.nextInt();
        System.out.println("Enter a  double number = ");
        double dbl = input.nextDouble();
        System.out.println("Enter a float number = ");
        float fl = input.nextFloat();
        System.out.println("Enter a char = ");
        char car = input.next().charAt(0);
        input.nextLine();
        System.out.println("Enter a string = ");
        String str = input.nextLine();
        System.out.println("The entered int is = " + x);
        System.out.println("The entered double is = " + dbl);
        System.out.println("The entered float is = " + fl);
        System.out.println("The entered char is = " + car);
        System.out.println("The entered char is = " + str);
        // // add two string ...........................................................................
        String s1 = "gian ki piche vagte jaw vagte jaw ";
        String s2 = "kaha jayoge ?";
        System.out.println(s1 + s2);
        // //odd even ..................................................
        System.out.println("enter a int to check if its even or odd = ");
        int a1 = input.nextInt();

        if (a1 % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
        // odd and even number form 1 to 20 ..................
        // int even_count = 0 , odd_count = 0 ;
        System.out.println("odd nums are ");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

    }
}


import java.util.*;

public class Return {

    public static void main(String[] args) {

        int first = add();
        int second = add();

        int sum = first + second;

        System.out.println(sum);
    }

    public static int add() {
        System.out.println("Enter the numbers");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        return num;
    }
}

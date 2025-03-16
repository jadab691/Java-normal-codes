
import java.util.*;

public class A {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int t = input.nextInt();
            input.nextLine(); // Consume the newline character after reading t

            while (t-- > 0) {
                String s = input.nextLine();
                int ans = 0;
                char lastChar = s.charAt(s.length() - 1); // Get the last character of the string

                // Iterate from the second last character to the beginning
                for (int i = s.length() - 2; i >= 0; i--) {
                    if (s.charAt(i) == lastChar) {
                        ans = s.length() - i - 1; // Calculate the length of the suffix
                        break; // Exit the loop once the last matching character is found
                    }
                }
                System.out.println(ans);
            }
        }
    }
}

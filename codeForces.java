
public class codeforces {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine(); // Consume the leftover newline

        while (t-- > 0) {
            String s = input.nextLine();
            String ans = s.substring(0, s.length() - 2) + "i";
            System.out.println(ans);
        }

        input.close();
    }
}

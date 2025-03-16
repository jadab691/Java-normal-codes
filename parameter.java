
public class parameter {

    public static void main(String[] args) {
        int ans = addWithParameter(5, 6);
        System.out.println(ans);

    }

    public static int addWithParameter(int a, int b) {
        System.out.println("first num is " + a);
        System.out.println("second num is " + b);
        int sum = a + b;
        return sum;
    }
}

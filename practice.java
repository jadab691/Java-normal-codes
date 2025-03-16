
public class practice {

    static int x = 5;

    practice() {
        x += 20;
    }

    void doadd(int a) {
        x += a;
        System.out.println(x);
    }

    public static void main(String[] args) {

        practice a = new practice();
        practice b = new practice();

        a.doadd(15);
        b.doadd(5);
    }
}

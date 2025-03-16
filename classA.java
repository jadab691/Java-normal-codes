
class classA {

    static int x = 5;

    classA() {
        x -= 20;
    }

    void doAdd(int a) {
        x += a;
        System.out.println(x);
    }

    public static void main(String[] args) {
        classA a = new classA();
        classA b = new classA();

        a.doAdd(5);
        b.doAdd(5);
    }
}

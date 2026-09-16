public class staticNested {
    public static void main(String[] args) {
        Outer outer = new Outer();

        Outer.Inner inner = new Outer.Inner();

        inner.fun(outer);
    }
}

class Outer {
    static int x = 10;
    int y;

    static class Inner {
        void fun(Outer outer) {
            System.out.println(x);
            System.out.println(outer.y);
        }
    }
}
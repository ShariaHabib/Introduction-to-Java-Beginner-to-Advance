class Outer1 {
    int outerx = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner1 {
                void display() {
                    System.out.println("display: outerx = " + outerx);
                }
            }
            Inner1 inner = new Inner1();
            inner.display();
        }
    }
}

public class InnerClassDemo1 {

    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        outer.test();
    }
}
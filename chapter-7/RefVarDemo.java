class MyClass {
    private int i;

    MyClass(int k) {
        i = k;
    }

    int geti() {
        return i;
    }

    void seti(int k) {
        if (k >= 0)
            i = k;
    }
}

public class RefVarDemo {

    public static void main(String[] args) {
        var obj = new MyClass(10);

        System.out.println("Value of i in obj is " + obj.geti());
        obj.seti(15);
        System.out.println("Value of i in obj is now " + obj.geti());
    }
}
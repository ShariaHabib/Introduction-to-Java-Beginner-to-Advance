public class PassArray {
    static void Test(int v[]) {
        System.out.print("Number of args: " + v.length + " Contents: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n1[] = { 10 };
        int n2[] = { 1, 2, 3 };
        int n3[] = { 10 };

        Test(n1);
        Test(n2);
        Test(n3);
    }
}